package pl.matusiewicz.jdbc_car.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"dogs"})
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "join_date")
    private Date join_date;

    @Column(name = "email")
    private String email;

    @Column(name = "user_password")
    private String user_password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Dog> dogs;

    @ManyToOne
    @JoinColumn(name = "dog2_id", referencedColumnName = "dog_id", nullable = false)
    private Dog dog;

}
