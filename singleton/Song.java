package singleton;

/**
 * A class that contains a song's name and artist
 */
public class Song {
    private String song;
    private String artist;

    /**
     * Creates a new song
     * @param song The name of the song
     * @param artist The artist who created the song
     */
    public Song(String song, String artist) {
        this.song = song;
        this.artist = artist;
    }

    /**
     * Returns "(song) by (artist)"
     * @return A string mentioning the song's name and artist
     */
    public String toString() {
        return song + " by " + artist;
    }
}
