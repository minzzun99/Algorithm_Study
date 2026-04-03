package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj26350_GoodCoinDenomination {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());

            int[] coin = new int[d];
            for (int i = 0; i < d; i++) {
                coin[i] = Integer.parseInt(st.nextToken());
            }

            boolean flag = true;
            System.out.printf("Denominations: %d ", coin[0]);
            for (int i = 1; i < d; i++) {
                if (coin[i - 1] * 2 > coin[i]) {
                    flag = false;
                }
                System.out.printf("%d ", coin[i]);
            }
            System.out.println();

            if (flag) {
                System.out.println("Good coin denominations!");
            } else {
                System.out.println("Bad coin denominations!");
            }
            System.out.println();
        }
    }
}
