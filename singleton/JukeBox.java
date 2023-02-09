package singleton;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * A JukeBox that can play songs
 */
public class JukeBox {
    private static JukeBox jukeBox = new JukeBox();
    private ArrayList<Song> songs;
    private Queue<String> songQueue;

    /**
     * Creates a JuteBox, loads in songs, and initializes a Linked List
     */
    private JukeBox() {
        songs = DataLoader.getSongs();
        songQueue = new LinkedList<String>();
    }

    /**
     * Returns the only instance of the JukeBox
     * @return The JukeBox
     */
    public static JukeBox getInstance() {
        return jukeBox;
    }

    /**
     * Plays the next song and removes it from the queue
     * @return A string saying "Let's jam to (song)"
     */
    public String playNextSong() {
        if (!hasMoreSongs()) {
            return "You need to add songs to the list";
        }

        return "Let's jam to " + songQueue.remove();
    }

    /**
     * 
     * @param title The song being requestied
     * @return A confirmation stating whether or not the song was added
     */
    public String requestSong(String title) {
        for (int i = 0; songs.size() > i; i++) {
            if (songs.get(i).toString().length() >= title.length()) {
                if (songs.get(i).toString().substring(0, title.length()).equals(title)) {
                    songQueue.add(songs.get(i).toString());
                    return title + " is now number " + songQueue.size() + " on the list";
                }
            }
        }

        return "Sorry, we do not have the song " + title;
    }
    
    /**
     * Checks the queue for more songs
     * @return True if there's more songs, false if not
     */
    public boolean hasMoreSongs() {
        return !songQueue.isEmpty();
    }
}