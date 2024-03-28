import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> answer = new ArrayList<>();
        
        for(int n : arr) answer.add(n);
        
        for(int d : delete_list){
            answer.removeIf(i -> i == d);
        }
        
        return answer.stream()
            .mapToInt(i -> i)
            .toArray();
        
    }
}