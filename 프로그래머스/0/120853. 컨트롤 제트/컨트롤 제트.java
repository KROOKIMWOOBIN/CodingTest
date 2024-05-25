class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strL = s.split(" ");
        
        for (int i = 0; i < strL.length; i++) {
            if (strL[i].equals("Z")) {
                answer -= Integer.parseInt(strL[i - 1]);
            } else {
                answer += Integer.parseInt(strL[i]);
            }
        }
        
        return answer;
    }
}