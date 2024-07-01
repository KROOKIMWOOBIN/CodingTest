import java.util.Scanner;

public class Main {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        if (B + C >= 60) {
            A += (B + C) / 60;
            B -= ((B + C) / 60) * 60;
        }
        if (A >= 24) {
            A -= 24;
        }
        B += C;
        
        System.out.print(A + " " + B);
    }
}