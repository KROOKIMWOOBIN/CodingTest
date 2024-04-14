class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] tmp = my_string.split("");
        
        for (int i : indices) {
            tmp[i] = "";
        }
        
        for (int i = 0; i < tmp.length; i++) {
            answer += tmp[i];
        }
        
        return answer;
    }
}