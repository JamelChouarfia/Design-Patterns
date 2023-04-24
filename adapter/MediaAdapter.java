package adapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MediaAdapter implements Media {
    private LittleMedia littleMedia;

    MediaAdapter(LittleMedia littleMedia) {
        this.littleMedia = littleMedia;
    }

    public String getTitle() {
        return littleMedia.getTitle();
    }

    public Author getAuthor() {
        String name = littleMedia.getAuthor();
        int counter = 0;

        while (name.charAt(counter) != ' ') {
            counter++;
        }
        
        String firstName = name.substring(0, counter);
        String lastName = name.substring(counter);
        
        return new Author(firstName, lastName);
    }

    public String getDescription() {
        return littleMedia.getDescription();
    }

    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        littleMedia.addReview(firstName + " " + lastName, date, (int) rating, comment);
    }

    public ArrayList<Review> getReviews() {
        ArrayList<String> littleReviews = littleMedia.getReviews();
        ArrayList<Review> formattedReviews = new ArrayList<Review>();

        for (int i = 0; littleReviews.size() > i; i++) {
            String review = littleReviews.get(i);
            int rating = Character.getNumericValue(review.charAt(0));

            int endCounter = 0;

            while (true) {
                if (review.charAt(endCounter) == 'b') {
                    if (review.charAt(endCounter + 1) == 'y') {
                        break;
                    }
                }

                endCounter++;
            }

            String comment = review.substring(10, endCounter - 1);
            int startCounter = endCounter + 2;

            while (true) {
                if (review.charAt(endCounter) == '-') {
                    if (review.charAt(endCounter + 1) == ' ') {
                        break;
                    }
                }

                endCounter++;
            }

            String name = review.substring(startCounter, endCounter);

            while (true) {
                if (review.charAt(startCounter) == ' ') {
                    break;
                }

                startCounter++;
            }

            String firstName = name.substring(0, startCounter);
            String lastName = name.substring(startCounter + 1);

            endCounter += 2;

            Date date = new Date(review.substring(endCounter));

            formattedReviews.add(new Review(firstName, lastName, date, rating, comment));
        }

        return formattedReviews;
    }
}