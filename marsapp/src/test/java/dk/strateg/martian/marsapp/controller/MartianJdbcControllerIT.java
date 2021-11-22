package dk.strateg.martian.marsapp.controller;

import dk.strateg.martian.marsapp.MarsappApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = MarsappApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MartianJdbcControllerIT {

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();
    HttpHeaders httpHeaders = new HttpHeaders();

    @Test
    void test() {
        System.out.println(port);
//        ResponseEntity<String>
    }
}
