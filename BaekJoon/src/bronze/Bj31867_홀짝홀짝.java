package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj31867_홀짝홀짝 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        int odd = 0;
        int even = 0;
        for(int i = 0; i < N; i++) {
            if ((arr[i] - '0') % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if (even > odd) {
            System.out.println(0);
        } else if (even < odd) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
