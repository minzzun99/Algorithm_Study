package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj33689_CPDU {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        while (N-- > 0) {
            char c = br.readLine().charAt(0);
            if (c == 'C') {
                count++;
            }
        }

        System.out.println(count);
    }
}
