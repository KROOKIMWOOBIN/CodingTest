import java.lang.StringBuilder;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = my_string.length() - 1; i >= 0; i--){
            sb.insert(0, my_string.charAt(i));
            if(sb.toString().equals(is_suffix)){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}