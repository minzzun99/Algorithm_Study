package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj33571_구멍 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int sum = 0;
        for(char ch : S.toCharArray()) {
            if(ch == 'B') {
                sum += 2;
            } else if (ch == 'A' || ch == 'D' || ch == 'O' || ch == 'P' || ch == 'Q' || ch == 'R' ||
                    ch == 'a' || ch == 'b' || ch == 'd' || ch == 'e' || ch == 'g' || ch == 'o' ||
                    ch == 'p' || ch == 'q' || ch == '@') {
                sum += 1;
            }
        }

        System.out.println(sum);
    }
}
