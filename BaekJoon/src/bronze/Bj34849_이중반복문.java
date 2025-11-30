package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34849_이중반복문 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (Math.pow(N, 2) > 100_000_000) {
            System.out.println("Time limit exceeded");
        } else {
            System.out.println("Accepted");
        }
    }
}
