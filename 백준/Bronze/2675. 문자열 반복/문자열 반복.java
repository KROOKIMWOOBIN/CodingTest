import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int T = in.nextInt();
        in.nextLine();
        
        for (int i = 1; i <= T; i++) {
            int R = in.nextInt();
            String S = in.next();
            
            for (int k = 0; k < S.length(); k++) {
                char c = S.charAt(k);
                
                for (int j = 1; j <= R; j++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
        in.close();
    }
}