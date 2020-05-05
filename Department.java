package pl.matusiewicz.jdbc_car.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;


@Data
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"employees"})
@Entity
@Table (name = "departments")
public class Department {

    @Id
    @Column(name = "dept_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dep_name", nullable = false)
    private String dep_name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Employee> employees;
}