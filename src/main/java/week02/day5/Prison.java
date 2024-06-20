package week02.day5;

import java.util.ArrayList;
import java.util.List;

public class Prison {

    private boolean[] cells = new boolean[100];

    public boolean[] getCells() {
        return cells;
    }

    public List<Integer> getCellsInt() {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < cells.length; i++) {
            if (cells[i]) {
                intList.add(i+1);
            }
        }
        return intList;
    }

    public void openFreeCells() {
        for (int day = 1; day <= 100; day++) {
            for (int c = day-1; c < 100; c += day) {
                cells[c] = !cells[c];
            }
        }
    }
}
