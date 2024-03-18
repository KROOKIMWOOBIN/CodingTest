import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int day = 10;
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++){ // // 맵을 사용해서 원하는 물품과 수량 맵핑
            map.put(want[i], number[i]);
        }
        
        for(int i = 0; i < discount.length - day + 1; i++){ // 10일동안 회원을 주기 때문에 -10을 해주었음
            Map<String, Integer> dMap = new HashMap<>();
            for(int j = 0; j < day; j++){ // 10일동안 할인받을 수 있는 물품이랑 수량 맵핑
                dMap.put(discount[i + j], dMap.getOrDefault(discount[i + j], 0) + 1);
            }
            boolean check = true;
            for(String key : map.keySet()){ // 내가 원하는 물품이랑 수량이 다를 경우 false를 리턴
                if(map.get(key) != dMap.get(key)){
                    check = false;
                    break;
                }
            }
            answer += check ? 1 : 0;
        }
        return answer;
    }
}