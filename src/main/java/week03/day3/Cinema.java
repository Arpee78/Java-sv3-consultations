package week03.day3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

//    public List<String> findMovieByTime(LocalDateTime time) {
//        List<String> result = new ArrayList<>();
//        for (Movie actualMovie : movies) {
//            for (LocalDateTime actualShowTime : actualMovie.getShowTimes()) {
//                if (actualShowTime.equals(time)) {
//                    result.add(actualMovie.getTitle());
//                }
//            }
//        }
//        return result;
//    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> result = new ArrayList<>();
        for (Movie actualMovie : movies) {
            String actualMovieTitle = actualMovie.getTitle();
            if(actualMovie.getShowTimes().contains(time) && !result.contains(actualMovieTitle)){
                result.add(actualMovieTitle);
            }
        }
        return result;
    }


//    public List<String> findMovieByTime(LocalDateTime time) {
//        List<String> result = new ArrayList<>();
//        for (Movie actualMovie : movies) {
//            for (LocalDateTime actualShowTime : actualMovie.getShowTimes()) {
//                if (!actualShowTime.isBefore(time) && actualShowTime.isBefore(time.plusMinutes(30))) {
//                    result.add(actualMovie.getTitle());
//                }
//            }
//        }
//        return result;
//    }

}
