import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] numList = new int[N];
        
        for (int i = 1; i <= N; i++) {
            numList[i - 1] = i;
        }
        
        for (int count = 1; count <= M; count++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int sw = numList[j];
            numList[j] = numList[i];
            numList[i] = sw;
        }
        
        for (int i = 0; i < numList.length; i++) {
            System.out.print(numList[i] + " ");
        }
    }
}