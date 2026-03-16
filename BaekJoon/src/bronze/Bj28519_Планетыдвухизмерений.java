package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj28519_Планетыдвухизмерений {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int total = 0;
        if (n <= m) {
            total = 2 * n;
        } else {
            total = 2 * m;
        }

        if(n != m) {
            total += 1;
        }
        System.out.println(total);
    }
}
