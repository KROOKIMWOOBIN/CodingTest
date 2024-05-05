class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] != 1) {
                answer++;
                num_list[i] = oneC(num_list[i]);
            } 
        }
        
        return answer;
    }
    
    private int oneC(int n) {
        if (n % 2 != 0) {
            return (n - 1) / 2;
        }
        
        return n / 2;
    }
}