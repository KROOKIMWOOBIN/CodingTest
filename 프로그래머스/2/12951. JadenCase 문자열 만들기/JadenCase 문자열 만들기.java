import java.lang.StringBuilder;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean check = true;
        for(int i = 0; i < s.length(); i++){
            if(check){
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            }
            else{
                sb.append(String.valueOf(s.charAt(i)).toLowerCase());
            }
            check = false;
            if(s.charAt(i) == ' ') check = true;
        }
        return sb.toString();
    }
}