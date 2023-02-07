package iterator;

/**
 * Information about a specific song
 */
public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;
    
    /**
     * Creates a song class that stores all the information about a song
     * @param name The name of the song
     * @param artist The author(s) of a song
     * @param length How long the song plays for
     * @param genre The genre of the song
     */
    public Song(String name, String artist, double length, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /**
     * Returns a string detailing all of the information about the song
     */
    public String toString() {
        return name + " by " + artist + " category: " + genre + " length: " + length + " min";
    }
}