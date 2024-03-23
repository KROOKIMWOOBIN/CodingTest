import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        collatz(n, list);
        return list.stream()
            .mapToInt(i -> i)
            .toArray();
    }
    
    private int collatz(int x, List<Integer> list){
        list.add(x);
        if(x == 1){
            return 1;
        }
        else if(x % 2 == 0){
            return collatz(x / 2, list);
        }
        else{
            return collatz(3 * x + 1, list);
        }
    }
}