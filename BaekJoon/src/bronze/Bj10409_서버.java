package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10409_서버 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int result = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (result = 0; result < n; result++) {
            T -= Integer.parseInt(st.nextToken());
            if (T < 0) {
                break;
            }
        }
        System.out.println(result);
    }
}
