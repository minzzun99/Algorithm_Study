package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj26566_Pizza {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int A1 = Integer.parseInt(st.nextToken());
            int P1 = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int R1 = Integer.parseInt(st.nextToken());
            int P2 = Integer.parseInt(st.nextToken());

            int pizza1 = A1 / P1;
            int pizza2 = (int) (R1 * R1 * Math.PI / P2);
            if (pizza1 < pizza2) {
                sb.append("Whole pizza\n");
            } else {
                sb.append("Slice of pizza\n");
            }
        }
        System.out.println(sb);
    }
}
