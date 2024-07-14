import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int num = sc.nextInt();
        int max = num;
        int min = num;
        for (int i = 1; i <= N - 1; i++) {
            num = sc.nextInt();
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.println(min + " " + max);
    }
}