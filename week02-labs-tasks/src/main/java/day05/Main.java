package day05;

public class Main {

    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        Movie movie = new Movie("Die Hard", 1988);
        System.out.println(movie.rateMovie(7));
        System.out.println(movie.rateMovie(5));
        System.out.println(movie.rateMovie(3));

        viewer.watchMovie(movie, 5);
        System.out.println("A " + movie.getTitle() + " c. film " + movie.getAvgRating() + " értékelésű " + movie.getNumberOfVoters() + " ember értékelése alapján.");
        viewer.watchMovie(movie, 4);
        System.out.println("A " + movie.getTitle() + " c. film " + movie.getAvgRating() + " értékelésű " + movie.getNumberOfVoters() + " ember értékelése alapján.");
    }
}
