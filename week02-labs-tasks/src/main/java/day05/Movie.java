package day05;

public class Movie {
    private String title;
    private int year;
    private double avgRating;
    private int numberOfVoters;
    private int sumRatings;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public double rateMovie(int rating) {
        numberOfVoters++;
        sumRatings += rating;
        return avgRating = ((double)sumRatings) / numberOfVoters;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfVoters() {
        return numberOfVoters;
    }

    public int getYear() {
        return year;
    }

    public double getAvgRating() {
        return avgRating;
    }

}
