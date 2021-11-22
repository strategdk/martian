package dk.strateg.martian.marsapp.controller;

import dk.strateg.martian.marsapp.entity.Martian;
import dk.strateg.martian.marsapp.service.MartianJdbcService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MartianJdbcController {

    final
    MartianJdbcService martianJdbcService;

    public MartianJdbcController(MartianJdbcService martianJdbcService) {
        this.martianJdbcService = martianJdbcService;
    }

    @GetMapping("/jdbc/martians")
    List<Martian> allMartians() {
        return martianJdbcService.findAll();
    }

    @GetMapping("/jdbc/martian/{id}")
    Martian findById(@PathVariable String id) {
        Long martianId = Long.parseLong(id);
        return martianJdbcService.findById(martianId);
    }

    @GetMapping("/jdbc/count")
    public Long count() {
        return martianJdbcService.count();
    }

    @DeleteMapping("/jdbc/martian/{id}")
    public void delete(@PathVariable String id) {
        Long martianId = Long.parseLong(id);
        martianJdbcService.deleteById(martianId);
    }


}
