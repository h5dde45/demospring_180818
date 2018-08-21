package com.example.mp.interfaces;


import com.example.mp.entities.MP3;

import java.util.List;

public interface Mp3Dao {
    void insert(MP3 mp3);
    void delete(MP3 mp3);
    MP3 getMp3ById(int id);
    List<MP3> getMp3ListByName(String name);
    List<MP3> getMp3ListByAuthor(String author);

}
