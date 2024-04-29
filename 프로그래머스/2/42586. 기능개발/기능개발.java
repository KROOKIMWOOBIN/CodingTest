import java.util.Stack;
import java.lang.Math;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> works = new Stack<>();
        int maxDay = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            int day = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
            
            if (day > maxDay) {
                works.push(1);
                maxDay = day;
            } else {
                int num = works.peek();
                works.pop();
                works.push(num + 1);
            }
        }
        
        return works.stream()
            .mapToInt(d -> d)
            .toArray();
    }
}