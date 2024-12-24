package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj32775_가희와4시간의벽1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        if (F < S) {
            System.out.println("flight");
        } else {
            System.out.println("high speed rail");
        }
    }
}
