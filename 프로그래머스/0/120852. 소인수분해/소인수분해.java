import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> numL = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                numL.add(i);
            }
        }
        
        return numL.stream()
            .mapToInt(num -> num)
            .toArray();
    }
    
    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}