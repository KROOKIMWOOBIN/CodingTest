import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            int input = sc.nextInt();
            A.add(input);
        }
        
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) < X) {
                System.out.print(A.get(i) + " ");
            }
        }
    }
}