package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj29163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (evenCount > oddCount) {
            System.out.println("Happy");
        } else {
            System.out.println("Sad");
        }
    }
}
