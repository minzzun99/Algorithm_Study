package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5525_IOIOI_50점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("I");
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();
        for (int i = 0; i < N; i++) {
            sb.append("OI");
        }
        String Pn = sb.toString();
        int PSize = Pn.length();

        int count = 0;
        for (int i = 0; i <= M - PSize; i++) {
            String str = S.substring(i, i + PSize);
            if (str.equals(Pn)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
