import java.util.Scanner;

public class Main {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int total = 0;
        
        total = diceGame(n1, n2, n3);
        System.out.print(total);
    }
    
    private static int diceGame(int n1, int n2, int n3) {
        if (n1 == n2 && n2 == n3) {
            return 10000 + (n1 * 1000);
        }
        if (n1 == n2 || n1 == n3) {
            return 1000 + (n1 * 100);
        }
        if (n2 == n3) {
            return 1000 + (n2 * 100);
        }
        if (n1 != n2 && n2 != n3 && n1 != n3) {
            return Math.max(n1, Math.max(n2, n3)) * 100;
        }
        
        return 0;
    }
}