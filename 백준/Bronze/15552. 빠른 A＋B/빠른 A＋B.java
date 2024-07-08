import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int T = Integer.parseInt(bf.readLine());

            for (int i = 0; i < T; i++) {
                String[] numbers = bf.readLine().split(" ");
                int A = Integer.parseInt(numbers[0]);
                int B = Integer.parseInt(numbers[1]);
                bw.write(A + B + "\n");
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
