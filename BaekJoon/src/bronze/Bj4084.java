package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj4084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if (!(a == 0 && b == 0 && c == 0 && d == 0)) {
                int count = 0;
                while (!(a == b && b == c && c == d)) {
                    int tempA = Math.abs(a - b);
                    int tempB = Math.abs(b - c);
                    int tempC = Math.abs(c - d);
                    int tempD = Math.abs(d - a);
                    a = tempA;
                    b = tempB;
                    c = tempC;
                    d = tempD;
                    count++;
                }
                System.out.println(count);
            } else {
                break;
            }
        }
    }
}
