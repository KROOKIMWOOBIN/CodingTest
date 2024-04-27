class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] strL = my_string.replaceAll("[^\\d]", " ").split(" ");
        
        for (String s : strL) {
            answer += !s.equals("") ? Integer.parseInt(s) : 0;
        }
        
        return answer;
    }
}