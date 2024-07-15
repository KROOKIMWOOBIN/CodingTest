import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();
            numList.add(num);
        }
        int target = sc.nextInt();
        int frequency = Collections.frequency(numList, target);
        System.out.print(frequency);
    }
}