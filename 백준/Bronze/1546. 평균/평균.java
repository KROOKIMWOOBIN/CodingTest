import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 70;
        int max = 0;
        int[] numbers = new int[N];
        double jumsu = 0;
        
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        
        for (int i = 0; i < N; i++) {
            jumsu += ((double)numbers[i] / max) * 100;
        }
        
        System.out.print(jumsu / N);
    }
}