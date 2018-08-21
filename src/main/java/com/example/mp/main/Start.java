package com.example.mp.main;

import com.example.mp.entities.MP3;
import com.example.mp.impls.SQLiteDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        MP3 mp3 = new MP3();
        mp3.setName("n6");
        mp3.setAuthor("a6");

        ApplicationContext context=
                new ClassPathXmlApplicationContext("db.xml");
        SQLiteDAO sqLiteDAO = (SQLiteDAO) context.getBean("SQLiteDAO");
        sqLiteDAO.insert(mp3);

    }
}
