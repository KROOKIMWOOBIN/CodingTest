import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {

        List<Integer> numList = new ArrayList<>();
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 1; j <= arr[i] * 2; j++) {
                    numList.add(arr[i]);
                }
            } else {
                for (int j = 1; j <= arr[i]; j++) {
                    numList.remove(numList.size() - 1);
                }
            }
        }
        
        return numList.stream().mapToInt(n -> n).toArray();
    }
}