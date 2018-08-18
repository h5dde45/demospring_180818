package com.example.entities;

public class ConsoleEventLogger implements EventLogger{
    public void logEvent(Event msg){
        System.out.println(msg);
    }
}
