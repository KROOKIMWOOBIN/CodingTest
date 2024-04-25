import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> al = new ArrayList<>();
        
        for (String intStr : intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s + l));
            if (num > k) {
                al.add(num);
            }
        }
        
        return al.stream()
            .mapToInt(n -> n)
            .toArray();
    }
}