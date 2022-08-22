package HW1.songGenerator.genresOfMusic;

import HW1.songGenerator.SongContainer;

import java.util.concurrent.ConcurrentHashMap;

public class Rock extends Thread {

    private final ConcurrentHashMap<String, String> rockMusic = SongContainer.getSongContainer();

    @Override
    public void run() {
        rockMusic.put("Океан Ельзи", "Місто Весни");
        rockMusic.put("ICDC", "Road to Hell");
    }

    public void getRockMusic() {
    }
}
