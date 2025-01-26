package HackerHank;

import java.util.List;

public class TwoSumProblem {

    public static String twoSums(List<Integer> numberList, int result) {
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = numberList.size()-1; j > i; j--) {
                if(numberList.get(i) + numberList.get(j) == result)
                    return "yes";
            }

        }
        return "no";
    }
}
