package HW1.producer;

public class Actor implements Runnable {

    String message;

    public Actor() {
    }

    @Override
    public void run() {
        System.out.println(getActor() + ":" + " Hi, I need money!");
    }

    public String getActor() {
        String actor = "Tom Cruse";
        return actor;
    }
}
