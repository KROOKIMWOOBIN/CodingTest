import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int[] basket = new int[N];
        
        for (int count = 1; count <= M; count++) {
            input = sc.nextLine();
            inputs = input.split(" ");
            int i = Integer.parseInt(inputs[0]);
            int j = Integer.parseInt(inputs[1]);
            int k = Integer.parseInt(inputs[2]);
            for (int point = i; point <= j; point++) {
                basket[point - 1] = k;
            }
        }
        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}