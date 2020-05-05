package pl.matusiewicz.jdbc_car.repositories;

import org.springframework.stereotype.Repository;
import pl.matusiewicz.jdbc_car.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;

@Repository
public interface RepoAppointments extends JpaRepository<Appointment, Long>{
}