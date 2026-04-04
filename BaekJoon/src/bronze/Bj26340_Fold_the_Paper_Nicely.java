package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj26340_Fold_the_Paper_Nicely {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            System.out.printf("Data set: %d %d %d\n", a, b, c);
            for (int j = 0; j < c; j++) {
                if (a >= b) {
                    a /= 2;
                } else {
                    b /= 2;
                }
            }

            if (a > b) {
                System.out.println(a + " " + b);
            } else {
                System.out.println(b + " " + a);
            }
            System.out.println();
        }
    }
}
