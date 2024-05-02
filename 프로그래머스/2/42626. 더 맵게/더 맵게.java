import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        int answer = 0;
        
        for (int s : scoville) {
            pQ.add(s);
        }
        while (pQ.size() > 1 && pQ.peek() < K) {
            int first = pQ.poll();
            int second = pQ.poll();
            int mix = first + (second * 2);
            pQ.add(mix);
            answer++;
        }
        if (pQ.peek() < K) {
            return -1;
        }
        
        return answer;
    }
}