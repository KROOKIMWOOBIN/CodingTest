import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (String str : strArr) {
            int s = str.length();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for(int s : map.values()) {
            if (answer < s) {
                answer = s;
            }
        }
        
        return answer;
    }
}