package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj26068_치킨댄스를추는곰곰이를본임스2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            int day = Integer.parseInt(br.readLine().replaceAll("D-", ""));
            if (day <= 90) {
                count++;
            }
        }
        System.out.println(count);
    }
}
