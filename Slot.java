package pl.matusiewicz.jdbc_car.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "slots")
public class Slot {

        @Id
        @Column(name = "slot_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long slot_id;

        @Column(name = "start_date")
        private Date start_date;

        @Column(name = "end_date")
        private Date end_date;

        @ManyToOne
        @JoinColumn(name = "emp2_id", referencedColumnName = "emp_id", nullable = false, insertable = false, updatable = false)
        private Employee employee;

        @ManyToOne
        @JoinColumn(name = "emp2_id", referencedColumnName = "emp_id", nullable = false, insertable = false, updatable = false)
        private Appointment appointment;

}
