package dk.strateg.martian.marsapp.service;

import dk.strateg.martian.marsapp.entity.Martian;
import dk.strateg.martian.marsapp.jdbc.MartianJdbcDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MartianJdbcService {

    private final MartianJdbcDao martianJdbcDao;

    public MartianJdbcService(MartianJdbcDao martianJdbcDao) {
        this.martianJdbcDao = martianJdbcDao;
    }

    public List<Martian> findAll() {
        return martianJdbcDao.findAll();
    }

    public Martian findById(Long id) {
        return martianJdbcDao.findById(id);
    }

    public Long count() {
        return martianJdbcDao.count();
    }

    public void deleteById(Long id) {
        martianJdbcDao.deleteById(id);
    }


}
