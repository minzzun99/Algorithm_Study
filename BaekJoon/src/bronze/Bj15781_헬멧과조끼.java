package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj15781_헬멧과조끼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int maxHelmet = 0;
        for (int i = 0; i < N; i++) {
            maxHelmet = Math.max(maxHelmet, Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        int maxArmor = 0;
        for (int i = 0; i < M; i++) {
            maxArmor = Math.max(maxArmor, Integer.parseInt(st.nextToken()));
        }

        System.out.println(maxHelmet + maxArmor);
    }
}
