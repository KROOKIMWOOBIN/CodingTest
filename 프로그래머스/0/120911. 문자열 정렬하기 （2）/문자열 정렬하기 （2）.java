import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        
        my_string = my_string.toLowerCase();
        
        char[] c = my_string.toCharArray();
        
        Arrays.sort(c);
        
        String answer = new String(c);
        
        return answer;
        
    }
}