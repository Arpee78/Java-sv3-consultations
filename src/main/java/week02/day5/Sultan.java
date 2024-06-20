package week02.day5;

import java.util.Arrays;

public class Sultan {

    public static void main(String[] args) {

        Prison prison = new Prison();
        prison.openFreeCells();
        System.out.println(prison.getCellsInt());
        System.out.println(Arrays.toString(prison.getCells()));
    }
}
