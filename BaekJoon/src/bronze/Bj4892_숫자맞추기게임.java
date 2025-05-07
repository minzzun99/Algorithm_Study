package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4892_숫자맞추기게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = 1;

        while(true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                break;
            }

            if(N % 2 == 0) {
                N = (((N * 3) / 2) * 3) / 9;
                sb.append(String.format("%d. even %d\n", num, N));
            }else {
                N = ((((N * 3) + 1) / 2) * 3) / 9;
                sb.append(String.format("%d. odd %d\n", num, N));
            }
            num++;
        }
        System.out.println(sb);
    }
}
