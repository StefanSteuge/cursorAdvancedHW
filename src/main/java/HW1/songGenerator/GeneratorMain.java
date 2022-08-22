package HW1.songGenerator;

import HW1.songGenerator.genresOfMusic.*;

public class GeneratorMain {

    public static void main(String[] args) throws InterruptedException {

        SongContainer songContainer = new SongContainer();

        Jazz jazz = new Jazz();
        Pop pop = new Pop();
        Dance dance = new Dance();
        Rock rock = new Rock();
        Rep rep = new Rep();

        jazz.getJazzMusic();
        pop.getPopMusic();
        dance.getDanceMusic();
        rock.getRockMusic();
        rep.getRepMusic();

        Thread thread = new Thread(jazz);
        Thread thread1 = new Thread(pop);
        Thread thread2 = new Thread(dance);
        Thread thread3 = new Thread(rock);
        Thread thread4 = new Thread(rep);

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread.join();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        songContainer.printSongContainer();
    }
}