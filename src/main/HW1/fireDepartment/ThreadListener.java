package main.HW1.fireDepartment;

public class ThreadListener implements Runnable{
    public boolean getMessage() {
        return true;
    }

    @Override
    public void run() {
        getMessage();
    }
}