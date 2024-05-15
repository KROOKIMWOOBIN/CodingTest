import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> numL = new ArrayList<>();
        List<Integer> numS = new ArrayList<>();
        
        for (int n : arr) {
            if (n == 2) {
                for (int ns : numS) {
                    numL.add(ns);
                }
                numS.clear();
                numL.add(n);
                continue;
            }
            if (!numL.isEmpty()) {
                numS.add(n);
            }
        }
        if (numL.isEmpty()) {
            numL.add(-1);
        }
        
        return numL.stream()
            .mapToInt(n -> n)
            .toArray();
    }
}