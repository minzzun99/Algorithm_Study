package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj30501_관공어찌하여목만오셨소 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String s = br.readLine();
            if (s.contains("S")) {
                System.out.println(s);
                break;
            }
        }
    }
}
