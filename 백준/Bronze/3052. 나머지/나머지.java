import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numberSet = new HashSet<>();
        
        for (int i = 1; i <= 10; i++) {
            int A = sc.nextInt();
            
            numberSet.add(A%42);
        }
        
        System.out.println(numberSet.size());
    }
}