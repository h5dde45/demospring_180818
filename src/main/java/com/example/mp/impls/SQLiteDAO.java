package com.example.mp.impls;

import com.example.mp.entities.MP3;
import com.example.mp.interfaces.Mp3Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SQLiteDAO implements Mp3Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(MP3 mp3) {
        String sql = "insert into mp3 (name,author) values (?,?)";
        jdbcTemplate.update(sql,
                new Object[]{mp3.getName(), mp3.getAuthor()});
    }

    @Override
    public void delete(MP3 mp3) {

    }

    @Override
    public MP3 getMp3ById(int id) {
        return null;
    }

    @Override
    public List<MP3> getMp3ListByName(String name) {
        return null;
    }

    @Override
    public List<MP3> getMp3ListByAuthor(String author) {
        return null;
    }
}
