package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj15904_UCPC는무엇의약자일까 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "UCPC";
        int count = 0;
        for (char c : br.readLine().toCharArray()) {
            if (c == str.charAt(count)) {
                count++;
            }
            if (count == 4) {
                break;
            }
        }

        if (count == 4) {
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }
    }
}
