package dk.strateg.martian.marsapp.controller;

import dk.strateg.martian.marsapp.entity.Martian;
import dk.strateg.martian.marsapp.service.MartianJpaService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MartianJpaController {

    private final MartianJpaService martianJpaService;

    public MartianJpaController(MartianJpaService martianJpaService) {
        this.martianJpaService = martianJpaService;
    }

    @GetMapping("/jpa/martians")
    List<Martian> allMartians() {
        return martianJpaService.findAll();
    }

    @GetMapping("/jpa/count")
    public Long count() {
        return martianJpaService.count();
    }

    @DeleteMapping("/jpa/martian/{id}")
    public void delete(@PathVariable String id) {
        Long userId = Long.parseLong(id);
        martianJpaService.deleteById(userId);
    }

}
