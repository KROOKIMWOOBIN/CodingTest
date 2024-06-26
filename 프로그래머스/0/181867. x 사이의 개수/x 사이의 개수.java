import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        return Arrays.stream(myString.split("x", myString.length()))
            .mapToInt(i -> i.length())
            .toArray();
    }
}