package HW1.songGenerator.genresOfMusic;

import HW1.songGenerator.SongContainer;

import java.util.concurrent.ConcurrentHashMap;

public class Rep extends Thread {
    private final ConcurrentHashMap<String, String> repMusic = SongContainer.getSongContainer();

    @Override
    public void run() {
        repMusic.put("Eminem", "Beautiful");
        repMusic.put("50cent", "In Da Club");
    }

    public void getRepMusic() {
    }
}
