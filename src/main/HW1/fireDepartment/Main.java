package main.HW1.fireDepartment;

public class Main  {

    public static void main(String[] args) throws InterruptedException {

        Threads first = new Threads();
        ThreadListener listener = new ThreadListener();
        Thread thread = new Thread(listener);

        thread.start();
        thread.join();

        first.start();
        first.join();

    }
}