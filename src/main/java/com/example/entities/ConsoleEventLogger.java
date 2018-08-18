package com.example.entities;

public class ConsoleEventLogger implements EventLogger{
    public void logEvent(String msg){
        System.out.println(msg);
    }
}
