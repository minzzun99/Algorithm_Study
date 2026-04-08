package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj32776_가희와4시간의벽2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Ma = Integer.parseInt(st.nextToken());
        int F = Integer.parseInt(st.nextToken());
        int Mb = Integer.parseInt(st.nextToken());
        if (S <= Ma + F + Mb || S <= 240) {
            System.out.println("high speed rail");
        } else {
            System.out.println("flight");
        }
    }
}
