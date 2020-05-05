package pl.matusiewicz.jdbc_car.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"appointments", "users"})
@Entity
@Table(name = "dogs")
public class Dog {

        @Id
        @Column(name = "dog_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long dog_id;

        @Column(name = "dog_name", nullable = false)
        private String dog_name;

        @OneToMany(mappedBy = "dog", cascade = CascadeType.ALL, orphanRemoval = true)
        private Set<Appointment> appointments;

        @ManyToOne
        @JoinColumn(name = "dog_owner", referencedColumnName = "user_id", nullable = false)
        private User user;

        @OneToMany(mappedBy = "dog", cascade = CascadeType.ALL, orphanRemoval = true)
        private Set<User> users;
    }