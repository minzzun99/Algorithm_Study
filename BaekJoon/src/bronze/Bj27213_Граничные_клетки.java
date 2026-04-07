package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj27213_Граничные_клетки {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        if (M == 1 || N == 1) {
            System.out.println(M + N - 1);
        } else {
            System.out.println((M + N) * 2 - 4);
        }
    }
}
