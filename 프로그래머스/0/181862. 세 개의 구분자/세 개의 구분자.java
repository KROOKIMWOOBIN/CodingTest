import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        List<String> strL = new ArrayList<>();
        String temp = "";
        
        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            
            if (c == 'a' || c == 'b' || c == 'c') {
                if (temp != "") {
                    strL.add(temp);
                    temp = "";
                }
            }
            else {
                temp += c;
            }
        }
        if (temp != "") {
            strL.add(temp);
        }
        if (strL.size() == 0) {
            strL.add("EMPTY");
        }
        
        String[] answer = strL.toArray(new String[strL.size()]); 
        
        return answer;
    }
}