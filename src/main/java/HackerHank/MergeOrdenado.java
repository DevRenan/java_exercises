package HackerHank;

import java.util.ArrayList;
import java.util.List;

public class MergeOrdenado {
    static ArrayList<Integer> c = new ArrayList<>();

    public static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
        int i = 0, j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i) < b.get(j)) {
                c.add(a.get(i));
                i++;
            } else {
                c.add(b.get(j));
                j++;
            }
        }
        while (i < a.size()) {
            c.add(a.get(i));
            i++;
        }
        while (j < b.size()) {
            c.add(b.get(j));
            j++;
        }

        return c;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3);
        List<Integer> b = List.of(2, 5, 5);
        var listMerged = mergeArrays(a, b);
        System.out.println(listMerged);
    }


}
