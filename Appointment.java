package pl.matusiewicz.jdbc_car.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"slots"})
@Entity
@Table(name="appointments")
public class Appointment {

    @Id
    @Column(name = "a_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "beg_date", nullable = false)
    private Time beg_date;

    @Column(name = "end_date", nullable = false)
    private Time end_date;

    @Column(name = "report")
    private boolean report;

    @ManyToOne
    @JoinColumn(name = "dog_id", referencedColumnName = "dog_id", nullable = false)
    private Dog dog;

    @ManyToOne
    @JoinColumn(name = "emp_id", referencedColumnName = "emp_id", nullable = false)
    private Employee employee;

    @OneToMany(mappedBy = "appointment", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Slot> slots;


}
