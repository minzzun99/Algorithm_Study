package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30792_gahuiandsousenkyo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 1;
        for (int i = 0; i < n - 1; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num > count) {
                result++;
            }
        }
        System.out.println(result);
    }
}
