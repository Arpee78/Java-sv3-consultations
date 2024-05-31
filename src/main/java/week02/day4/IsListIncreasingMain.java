package week02.day4;

import java.util.Arrays;
import java.util.List;

public class IsListIncreasingMain {

    public static void main(String[] args) {
        ListAlgorithms listAlgorithms = new ListAlgorithms();
        System.out.println(listAlgorithms.isListIncreasing(Arrays.asList(1, 4, 6, 1, 2)));
        System.out.println(listAlgorithms.isListIncreasing(Arrays.asList(1, 4, 6, 7, 12)));
        List<Integer> testList1 = Arrays.asList(5, 4, 6, 7, 3, 5, 6, 8, 1, 2, 4);
        List<Integer> testList2 = Arrays.asList(5, 4, 6, 7, 3, 5, 6, 8, 1, 2, 4, 3, 2, 1, -1, 9, 2);
        System.out.println(listAlgorithms.countIncSubSequences(testList1));
    }
}
