package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34824_연대다음고대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int yonseiRank = 0;
        int koreaRank = 0;
        for (int i = 1; i <= N; i++) {
            String input = br.readLine();
            if (input.equals("yonsei")) {
                yonseiRank = i;
                continue;
            } else if (input.equals("korea")) {
                koreaRank = i;
            }
        }

        if (yonseiRank < koreaRank) {
            System.out.println("Yonsei Won!");
        } else {
            System.out.println("Yonsei Lost...");
        }
    }
}
