import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>(); 
        for (int i = 1; i <= 28; i++) {
            int num = sc.nextInt();
            numList.add(num);
        }
        
        Collections.sort(numList);
        for (int i = 1; i <= 30; i++) {
            if (!numList.contains(i)) {
                System.out.println(i);
            }
        }
    }
}