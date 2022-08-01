package main.HW1.producer;

public class Actor implements Runnable {
    public volatile String message;

    public Actor(String message) {
        this.message = message;
    }
    public String getMessage() {
        return " Hi, I need money!";
    }
    @Override
    public void run() {
        getMessage();
    }
    public String getActor() {
        return "Tom Cruse";
    }
}
