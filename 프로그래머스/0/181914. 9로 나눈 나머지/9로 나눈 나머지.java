class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] numbers = number.split("");
        for(String n : numbers){
            sum += Integer.parseInt(n);
        }
        return answer = sum % 9;
    }
}