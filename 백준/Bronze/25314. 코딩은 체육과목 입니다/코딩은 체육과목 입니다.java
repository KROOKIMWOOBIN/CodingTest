import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int N = sc.nextInt();
        
        for (int i = 4; i <= N; i += 4) {
            System.out.print("long ");
        }
        
        System.out.print("int");
    }
}