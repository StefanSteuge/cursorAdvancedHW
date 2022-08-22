package HW1.fireDepartment;

public class Threads extends Thread {
    ThreadListener listener = new ThreadListener();

    @Override
    public void run() {
        if (listener.getMessage()) {
            System.out.println("HELP! " + " The fire brigade went to the call!");
        } else {
            System.out.println("QUIET " + " The fire brigade waiting for call!");
        }
    }
}