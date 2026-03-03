package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj31608_HammingDistance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] S = br.readLine().toCharArray();
        char[] T = br.readLine().toCharArray();

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (S[i] != T[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
