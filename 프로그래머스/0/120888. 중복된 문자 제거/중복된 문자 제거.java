import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string) {
        boolean[] ascii = new boolean[256];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(!ascii[c]){
                ascii[c] = true;
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}