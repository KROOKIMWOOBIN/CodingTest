import java.lang.StringBuilder;

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        
        String[] morseString = letter.split(" ");
        
        String[] morseList = {
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..","--","-.",
            "---",".--.","--.-",".-.","...","-","..-","...-",
            ".--","-..-","-.--","--.."
        };
        
        for (String s : morseString) {
            for (int i = 0; i < morseList.length; i++) {
                if (s.equals(morseList[i])) {
                    sb.append(Character.toString(i + 'a'));
                }
            }
        }
        
        return sb.toString();
    }
}