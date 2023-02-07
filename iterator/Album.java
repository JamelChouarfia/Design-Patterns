package iterator;

/**
 * A list containing a
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
     */
    public boolean addSong(String name, String artist, double length, Genre genre) {
        if (20 > count) {
            songs[count] = new Song(name, artist, length, genre);
            count++;
            return true;
        } else {
            return false;
        }
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
     */
    public String getName() {
        return name;
    }
}