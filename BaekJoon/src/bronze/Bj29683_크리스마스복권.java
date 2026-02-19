package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj29683_크리스마스복권 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        int count = 0;
        st = new StringTokenizer(br.readLine());
        while (n-- > 0) {
            int amount = Integer.parseInt(st.nextToken());
            count += amount / A;
        }

        System.out.println(count);
    }
}
