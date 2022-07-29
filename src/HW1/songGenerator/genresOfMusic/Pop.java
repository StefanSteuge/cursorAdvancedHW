package HW1.songGenerator.genresOfMusic;

import HW1.songGenerator.SongContainer;

import java.util.concurrent.ConcurrentHashMap;

public class Pop extends Thread {
    private final ConcurrentHashMap<String, String> popMusic = SongContainer.getSongContainer();

    @Override
    public void run() {
        popMusic.put("Дзідзьо", "Павук");
        popMusic.put("Ed Sheeran", "Perfect");
    }

    public void getPopMusic() {
    }
}
