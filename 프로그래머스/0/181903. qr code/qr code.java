import java.lang.StringBuilder;

class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        int w = 0;
        
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer.append(code.charAt(i));
            }
        }
        
        return answer.toString();
    }
}