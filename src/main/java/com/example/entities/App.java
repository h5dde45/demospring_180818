package com.example.entities;

public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public App() {
    }

    public App(Client client, ConsoleEventLogger consoleEventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void logEvent(String msg) {
        String message = msg.replaceAll(
                client.getId(), client.getFullName()
        );
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {
        App app = new App();
        app.client=new Client("1","asd fg");
        app.eventLogger=new ConsoleEventLogger();

        app.logEvent("Some event for use 1");
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
