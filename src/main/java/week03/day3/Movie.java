package week03.day3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private List<LocalDateTime> showTimes;

    public Movie(String title, List<LocalDateTime> showTimes) {
        this.title = title;
        this.showTimes = showTimes;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getShowTimes() {
        return new ArrayList<>(showTimes);
    }
}
