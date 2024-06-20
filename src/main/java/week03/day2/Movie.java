package week03.day2;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private int year;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int count = 0;
        for (Actor actual : actors) {
            int ageAtMovie = year - actual.getYearOfBirth();
            if (ageAtMovie >= 20 && ageAtMovie < 30) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Actor leonardoDiCaprio = new Actor("Leonardo Dicaprio", 1974);
        Actor kateWinslet = new Actor("Kate Winslet", 1975);
        Actor billyZane = new Actor("Billy Zane", 1966);
        Movie movie = new Movie("Titanic", 1997);
        movie.addActor(leonardoDiCaprio);
        movie.addActor(kateWinslet);
        movie.addActor(billyZane);

        System.out.println(movie.actorsInTheirTwenties());
    }
}
