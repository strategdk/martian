package dk.strateg.martian.marsapp.repository;

import dk.strateg.martian.marsapp.entity.Base;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository extends JpaRepository<Base, Integer> {
    long countById(Integer id);
}