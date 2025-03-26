package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj4299_AFC윔블던 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if ((N + M) % 2 != 0 || N < M) {
            System.out.println(-1);
        } else {
            System.out.println(((N + M) / 2) + " " + (((N + M) / 2) - M));
        }
    }
}
