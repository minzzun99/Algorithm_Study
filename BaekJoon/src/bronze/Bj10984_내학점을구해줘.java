package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10984_내학점을구해줘 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            double score = 0;
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int C = Integer.parseInt(st.nextToken());
                double G = Double.parseDouble(st.nextToken());
                count += C;
                score += (G * C);
            }
            sb.append(count + " " + String.format("%.1f", (score / count))).append('\n');
        }

        System.out.println(sb);
    }
}
