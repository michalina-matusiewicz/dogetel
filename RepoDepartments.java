package pl.matusiewicz.jdbc_car.repositories;

import org.springframework.stereotype.Repository;
import pl.matusiewicz.jdbc_car.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface RepoDepartments extends JpaRepository<Department, Long>{
}