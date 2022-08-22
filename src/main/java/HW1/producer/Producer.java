package HW1.producer;

public class Producer extends Thread {
    Actor actor = new Actor("");
    @Override
    public void run() {
        System.out.println(actor.getActor() + actor.getMessage());
        System.out.println("Producer: " + "OK, but first go to work!");
    }
}
