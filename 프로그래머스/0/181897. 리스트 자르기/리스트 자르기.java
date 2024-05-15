import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> numL = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch (n) {
            case 1:
                for (int i = 0; i <= b; i++) {
                    numL.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = a; i < num_list.length; i++) {
                    numL.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = a; i <= b; i++) {
                    numL.add(num_list[i]);
                }
                break;
            case 4:
                for (int i = a; i <= b; i += c) {
                    numL.add(num_list[i]);
                }
                break;
        }
        
        return numL.stream()
            .mapToInt(num -> num)
            .toArray();
    }
}