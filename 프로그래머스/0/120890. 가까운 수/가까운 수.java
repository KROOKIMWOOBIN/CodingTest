import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int max = Math.abs(n - array[0]);
        
        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);
            
            if (diff < max) {
                answer = array[i];
                max = diff;
            }
            if (diff == max && array[i] < answer) {
                answer = array[i];
            }
        }
        
        return answer;
    }
}