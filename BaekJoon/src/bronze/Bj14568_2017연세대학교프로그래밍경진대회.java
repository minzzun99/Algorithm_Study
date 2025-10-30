package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj14568_2017연세대학교프로그래밍경진대회 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for (int x = 1; x < N + 1; x++) {
            for (int y = 1; y < N + 1; y++) {
                for (int z = 1; z < N + 1; z++) {
                    if (x + y + z == N && x >= y + 2 && z % 2 == 0) {
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
