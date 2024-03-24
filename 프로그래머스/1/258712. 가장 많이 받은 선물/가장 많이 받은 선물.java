import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int friendsL = friends.length;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < friendsL; i++){
            map.put(friends[i], i);
        }
        
        int[] giftCount = new int[friendsL];
        int[][] giftGraph = new int[friendsL][friendsL];
        
        for(String gift : gifts){ // 선물 지수랑 그래프 작성
            String[] str = gift.split(" ");
            giftCount[map.get(str[0])]++;
            giftCount[map.get(str[1])]--;
            giftGraph[map.get(str[0])][map.get(str[1])]++;
        }
        
        for(int i = 0; i < friendsL; i++){
            int num = 0;
            for(int j = 0; j < friendsL; j++){
                if(i == j) continue; // 자기 자신이여서 스킵
                if((giftGraph[i][j] > giftGraph[j][i]) ||
                   (giftGraph[i][j] == giftGraph[j][i]) &&
                  (giftCount[i] > giftCount[j])) num++;
            }
            if(answer < num) answer = num;
        }
        
        return answer;
    }
}