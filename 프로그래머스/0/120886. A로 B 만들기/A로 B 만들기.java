import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        String arr1 = new String(a);
        String arr2 = new String(b);
        
        return arr1.equals(arr2) ? 1 : 0;
            
    }
}