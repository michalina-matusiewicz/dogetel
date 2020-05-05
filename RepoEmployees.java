package pl.matusiewicz.jdbc_car.repositories;

import org.springframework.stereotype.Repository;
import pl.matusiewicz.jdbc_car.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface RepoEmployees extends JpaRepository<Employee, Long>{
}