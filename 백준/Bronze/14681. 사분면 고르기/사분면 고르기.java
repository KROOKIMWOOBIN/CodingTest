import java.util.Scanner;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if (x > 0) {
            if (y > 0) {
                System.out.print("1");
            }
            if (y < 0) {
                System.out.print("4");
            }
        }
        if (x < 0) {
            if (y > 0) {
                System.out.print("2");
            }
            if (y < 0) {
                System.out.print("3");
            }
        }
    }
}