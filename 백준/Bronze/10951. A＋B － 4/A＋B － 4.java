import java.util.Scanner;

public class Main {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B= sc.nextInt();
            System.out.println(A + B);
        }
    }
}