package HW1.songGenerator.genresOfMusic;

import HW1.songGenerator.SongContainer;

import java.util.concurrent.ConcurrentHashMap;

public class Jazz extends Thread {
    private final ConcurrentHashMap<String, String> jazzMusic = SongContainer.getSongContainer();

    @Override
    public void run() {
        jazzMusic.put("Cy Laurie", "Bull Fiddle Blues");
        jazzMusic.put("Jay Rowe", "There She Goes");
    }

    public void getJazzMusic() {
    }
}
