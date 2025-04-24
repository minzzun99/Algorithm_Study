package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11648_지속 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        while (N > 9) {
            int num = 1;
            while (N > 0) {
                num *= N % 10;
                N /= 10;
            }
            N = num;
            count++;
        }
        System.out.println(count);
    }
}
