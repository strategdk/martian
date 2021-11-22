package dk.strateg.martian.marsapp.service;

import dk.strateg.martian.marsapp.entity.Martian;
import dk.strateg.martian.marsapp.repository.MartianRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MartianJpaService {

    private final MartianRepository martianRepository;

    public MartianJpaService(MartianRepository martianRepository) {
        this.martianRepository = martianRepository;
    }

    public List<Martian> findAll() {
        var it = martianRepository.findAll();

        var martians = new ArrayList<Martian>();
        it.forEach(martians::add);

        return martians;
    }

    public Long count() {
        return martianRepository.count();
    }

    public void deleteById(Long userId) {
        martianRepository.deleteById(userId);
    }
}



