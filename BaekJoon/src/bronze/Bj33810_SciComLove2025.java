package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj33810_SciComLove2025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String original = "SciComLove";

        int count = 0;
        for (int i = 0; i < original.length(); i++) {
            if (S.charAt(i) != original.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
