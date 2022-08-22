package HW1.songGenerator.genresOfMusic;

import HW1.songGenerator.SongContainer;

import java.util.concurrent.ConcurrentHashMap;

public class Dance extends Thread {
    private final ConcurrentHashMap<String, String> danceMusic = SongContainer.getSongContainer();

    @Override
    public void run() {
        danceMusic.put("Latina", "Rock&Roll");
        danceMusic.put("Dance", "Twist");
        danceMusic.put("Classical", "Waltz");
    }

    public void getDanceMusic() {
    }
}
