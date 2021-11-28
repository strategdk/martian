package dk.strateg.martian.marsapp.repository;

import dk.strateg.martian.marsapp.entity.Martian;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
class MartianRepositoryTest {

    @Autowired
    TestEntityManager entityManager;

    @Autowired
    MartianRepository sut;

    @Test
    void should_save_martian() {
        Martian martian = new Martian();
        martian.setFirstName("Elon");
        martian = entityManager.persistAndFlush(martian);

        Optional<Martian> actual = sut.findById(martian.getId());
        assertTrue(actual.isPresent());
        assertEquals(martian.getId(), actual.get().getId());
        assertEquals(martian.getFirstName(), actual.get().getFirstName());
    }

}