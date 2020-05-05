package pl.matusiewicz.jdbc_car.repositories;

import org.springframework.stereotype.Repository;
import pl.matusiewicz.jdbc_car.models.Slot;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface RepoSlots extends JpaRepository<Slot, Long>{
}
