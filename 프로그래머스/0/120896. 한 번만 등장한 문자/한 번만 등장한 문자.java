import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }
            }
            if (count == 1) {
                answer += str[i];
            }
        }
        
        char[] c = answer.toCharArray();
        
        Arrays.sort(c);
        
        answer = new String(c);
        
        return answer;
    }
}