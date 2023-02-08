package iterator;

/**
 * A album which contains its name, an array of songs, and a count of how many songs have been added
 */
public class Album {
    private Song[] songs;
    private int count;
    private String name;

    /**
     * Creates an album and names it
     * @param name The name of the album
     */
    public Album(String name) {
        songs = new Song[20];
        count = 0;
        this.name = name;
    }

    /**
     * Adds a song to the songs array
     * @param name The name of the song being created
     * @param artist The name of the author(s) of the song
     * @param length How long the song plays for
     * @param genre The genre of the song
     * @return True if a song was able to be added, false if not
     */
    public boolean addSong(String name, String artist, double length, Genre genre) {
        if (songs.length < count) {
            return false;
        }

        songs[count] = new Song(name, artist, length, genre);
        count++;

        return true;
    }

    /**
     * Creates and returns an AlbumIterator
     * @return An AlbumIterator that keeps track of the songs
     */
    public AlbumIterator createIterator() {
        return new AlbumIterator(songs);
    }

    /**
     * Returns the name of the album
     * @return The name of the album
     */
    public String getName() {
        return name;
    }
}