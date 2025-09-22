package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34443_HackaHolics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        System.out.println(N * P);
    }
}
