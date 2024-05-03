import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> numL = new ArrayList<>();
        int size = 1;    
    
        while (arr.length > size) {
            size *= 2;
        }
        for (int n : arr) {
            numL.add(n);
        }
        for (int i = numL.size(); i < size; i++) {
            numL.add(0);
        }
        
        return numL.stream()
            .mapToInt(n -> n)
            .toArray();
    }
}