package week02.day4;

import java.util.List;

public class ListAlgorithms {

    public boolean isListIncreasing(List<Integer> testList) {
        for (int i = 1; i < testList.size(); i++) {
            if (testList.get(i - 1) > testList.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int countIncSubSequences(List<Integer> testList) {
        int count = 0;
        boolean isSubSequence = false;
        for (int i = 1; i < testList.size(); i++) {
            if (testList.get(i - 1) < testList.get(i)) {
                isSubSequence = true;
            } else if (isSubSequence) {
                isSubSequence = false;
                count++;
            }
        }

        if (isSubSequence) {
            count++;
        }
        return count;
    }


}
