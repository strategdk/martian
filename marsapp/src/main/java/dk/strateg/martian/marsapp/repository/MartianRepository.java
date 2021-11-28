package dk.strateg.martian.marsapp.repository;

import dk.strateg.martian.marsapp.entity.Martian;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// https://spring.io/blog/2021/09/22/spring-data-jdbc-how-do-i-make-bidirectional-relationships
@Repository
public interface MartianRepository extends CrudRepository<Martian, Integer> {
}
