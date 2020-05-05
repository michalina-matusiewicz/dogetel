package pl.matusiewicz.jdbc_car.repositories;

import org.springframework.stereotype.Repository;
import pl.matusiewicz.jdbc_car.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface RepoUsers extends JpaRepository<User, Long>{
}