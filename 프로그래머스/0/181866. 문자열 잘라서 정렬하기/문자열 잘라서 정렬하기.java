import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        String[] strArray = myString.split("x");
        ArrayList<String> al = new ArrayList<>();
        
        for (String str : strArray) {
            if (!str.isEmpty()) {
                al.add(str);
            }
        }
        
        String[] answer = al.toArray(new String[al.size()]);
        Arrays.sort(answer);
        
        return answer;
    }
}