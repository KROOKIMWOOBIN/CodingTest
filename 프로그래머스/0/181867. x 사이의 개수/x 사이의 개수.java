import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        List<Integer> al = new ArrayList<>();
        boolean check = true;
        int count = 0;
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                al.add(count);
                count = 0;
                check = false;
            }
            else{
                check = true;
                count++;
            }
        }
        al.add(count);
        int[] answer = al.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}