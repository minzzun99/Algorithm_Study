package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW2071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=1; i<=T; i++) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<10; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            double avg = sum / 10.0;
            sb.append("#").append(i).append(" ").append(Math.round(avg)).append('\n');
            // Math.round() 소수점 아래에서 반올림
        }
        System.out.println(sb);
    }
}
