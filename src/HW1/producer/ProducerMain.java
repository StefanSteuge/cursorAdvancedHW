package HW1.producer;

public class ProducerMain {
    public static void main(String[] args) throws InterruptedException {

        Actor actor = new Actor();
        Producer producer = new Producer();

        Thread fromActor = new Thread(new Thread(actor));
        Thread fromProducer = new Thread(producer);

        fromActor.start();
        fromProducer.start();

        fromActor.join();
        fromProducer.join();
    }
}
//2) продюсер-отримувач: один потік відправляє дані, інші його отримають і опрацьовують
