package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj23759_사장님도박은재미로하셔야합니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == -1) {
                break;
            }
            sum += N;
        }

        System.out.println(sum);
    }
}
