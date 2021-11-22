package dk.strateg.martian.marsapp;

import dk.strateg.martian.marsapp.jdbc.MartianJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"dk.strateg.martian.marsapp"})
public class MarsappApplication {
//public class MarsappApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

//	@Autowired
//	MartianJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(MarsappApplication.class, args);
	}

//	@Override
//	public void run(String... args) {
//		logger.info("All martians ->{}", dao.findAll());
//		logger.info("Martian 2 ->{}", dao.findById(2));
//	}
}
