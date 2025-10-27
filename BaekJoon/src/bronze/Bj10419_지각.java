package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10419_지각 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int d = Integer.parseInt(br.readLine());
            int max = 1;
            while (max + (max * max) <= d) {
                max++;
            }
            System.out.println(max - 1);
        }
    }
}
