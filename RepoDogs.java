package pl.matusiewicz.jdbc_car.repositories;

import org.springframework.stereotype.Repository;
import pl.matusiewicz.jdbc_car.models.Dog;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface RepoDogs extends JpaRepository<Dog, Long>{
}
