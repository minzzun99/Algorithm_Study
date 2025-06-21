package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5300_FilltheRowboats {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++){
            if (i == N) {
                sb.append(i).append(" Go!");
            } else if (i % 6 == 0) {
                sb.append(i).append(" Go! ");
            } else {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
}
