package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj24860_CountingAntibodies {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long Vk = Long.parseLong(st.nextToken());
        long Jk = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long Vr = Long.parseLong(st.nextToken());
        long Jr = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long Vh = Long.parseLong(st.nextToken());
        long Dh = Long.parseLong(st.nextToken());
        long Jh = Long.parseLong(st.nextToken());

        long result1 = Vh * Dh * Jh;
        long result2 = Vk * Jk;
        long result3 = Vr * Jr;

        System.out.println(result1 * (result2 + result3));
    }
}
