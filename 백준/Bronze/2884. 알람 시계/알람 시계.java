import java.util.Scanner;

public class Main {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if (M - 45 < 0) {
            H -= 1;
            M += 60;
        }
        if (H < 0) {
            H += 24;
        }
        M -= 45;
        
        System.out.print(H + " " + M);
    }
}