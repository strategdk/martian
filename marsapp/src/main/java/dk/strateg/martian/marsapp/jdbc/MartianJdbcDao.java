package dk.strateg.martian.marsapp.jdbc;

import dk.strateg.martian.marsapp.entity.Martian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MartianJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    // select * from martian
    public List<Martian> findAll() {
        //noinspection SqlResolve,SqlNoDataSourceInspection,SqlNoDataSourceInspection,SqlNoDataSourceInspection
        return jdbcTemplate.query("select * from martian", new BeanPropertyRowMapper<>(Martian.class));
    }

    // select * from martian
    public Martian findById(Long id) {
        return jdbcTemplate.queryForObject("select * from martian where martian_id=?", new BeanPropertyRowMapper<>(Martian.class), id);
    }

    public Long count() {
        var count = jdbcTemplate.queryForObject("select count(*) from martian", Long.class);
        return count;
    }

    public void deleteById(Long id) {
        jdbcTemplate.update("delete from martian where martian_id=?", id);
    }

}
