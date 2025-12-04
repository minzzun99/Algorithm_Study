package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w1 = Integer.parseInt(br.readLine());
        int h1 = Integer.parseInt(br.readLine());
        int w2 = Integer.parseInt(br.readLine());
        int h2 = Integer.parseInt(br.readLine());

        int result = w1 + 2 + w2 + 2 + (h1 + h2) * 2;
        if (w1 > w2) {
            result += w1 - w2;
        } else if (w1 < w2) {
            result += w2 - w1;
        }

        System.out.println(result);
    }
}
