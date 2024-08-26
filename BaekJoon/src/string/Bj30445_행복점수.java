package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj30445_행복점수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String msg = br.readLine();
        long Ph = 0;
        long Pg = 0;
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            if (c == 'H' || c == 'P' || c == 'Y') {
                Ph++;
            } else if (c == 'S' || c == 'D') {
                Pg++;
            } else if (c == 'A') {
                Ph++;
                Pg++;
            }
        }

        if (Ph == 0 && Pg == 0) {
            System.out.println("50.00");
        } else {
            double H = (double) Ph / (Ph + Pg);
            System.out.printf("%.2f", Math.round(H * 10000) / 100.0);
        }
    }
}
