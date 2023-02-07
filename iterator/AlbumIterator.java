package iterator;

import java.util.Iterator;

/**
 * An album iterator
 */
public class AlbumIterator implements Iterator {
    private Song[] song;
    private int position;

    /**
     * Sets up the song list and sets the position to the first song
     * @param songs The array of songs that will be used
     */
    public AlbumIterator(Song[] songs) {
        this.song = songs;
        position = 0;
    }

    /**
     * Checks to see if the list has another song waiting to be sent.
     */
    public boolean hasNext() {
        /**
         * Prevents checking for a song in an invalid position
         */
        return song.length > position - 1 && song[position] != null;
    }

    /**
     * Moves the current position up by one and returns the song that was at the original position
     */
    public Song next() {
        position++;
        return song[position - 1];
    }
}