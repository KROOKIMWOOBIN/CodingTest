import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> works = new ArrayList<>();
        int maxDay = 0;
        
        for (int i = 0; i < progresses.length; i++) {
            int day = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
            
            if (day > maxDay) {
                works.add(1);
                maxDay = day;
            } else {
                works.set(works.size() - 1, works.get(works.size() - 1) + 1);
            }
        }
        
        return works.stream()
            .mapToInt(d -> d)
            .toArray();
    }
}