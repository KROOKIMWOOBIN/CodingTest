import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= T; i++) {
            String testCase = sc.nextLine();
            
            char first = testCase.charAt(0);
            char last = testCase.charAt(testCase.length() - 1);
            
            System.out.println(first + "" + last);
        }
    }
}