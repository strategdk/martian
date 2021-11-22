package dk.strateg.martian.marsapp;

import dk.strateg.martian.marsapp.entity.Martian;
import dk.strateg.martian.marsapp.service.MartianJpaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MarsappApplicationTests {

	@Autowired
	MartianJpaService martianService;

	@Test
	void contextLoads() {
	}

	@Test
	void print() {
		System.out.println("print test");
		List<Martian> martians;
		martians = martianService.findAll();
		martians.forEach(m -> System.out.println(m.toString()));
	}

}
