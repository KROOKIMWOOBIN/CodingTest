import java.util.Scanner;

public class Main {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            sum += a * b;
        }
        
        if (sum == X) {
            System.out.print("Yes");
            return;
        }
        
        System.out.print("No");
    }
}