class Solution {
    public int solution(int[] numbers, int target) {
        int answer = targetNumber(numbers, 0, target, 0);
        return answer;
    }
    
    public int targetNumber(int[] numbers, int depth, int target, int sum) {
        if (numbers.length == depth) {
            if (target == sum) {
                return 1;
            }
            return 0;
        }
        int add = targetNumber(numbers, depth + 1, target, sum + numbers[depth]);
        int sub = targetNumber(numbers, depth + 1, target, sum - numbers[depth]);
        return add + sub;
    }
}