package HW1.songGenerator;

import java.util.concurrent.ConcurrentHashMap;

public class SongContainer {
    private static final ConcurrentHashMap<String, String> songContainer = new ConcurrentHashMap<>();

    public static ConcurrentHashMap<String, String> getSongContainer() {
        return songContainer;
    }

    public void printSongContainer() {
        System.out.println(songContainer);
    }
}