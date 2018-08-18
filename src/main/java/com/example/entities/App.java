package com.example.entities;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public App() {
    }

    public App(Client client, ConsoleEventLogger consoleEventLogger) {
        this.client = client;
        this.eventLogger = consoleEventLogger;
    }

    public void logEvent(String msg) {
        String message = msg.replaceAll(
                client.getId(), client.getFullName()
        );
//        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) context.getBean("app");

        app.logEvent("Some event for use 1");
        app.logEvent("Some event for use 2");
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ConsoleEventLogger getEventLogger() {
        return eventLogger;
    }

    public void setEventLogger(ConsoleEventLogger eventLogger) {
        this.eventLogger = eventLogger;
    }
}
