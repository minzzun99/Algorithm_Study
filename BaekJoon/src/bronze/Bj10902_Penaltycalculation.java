package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10902_Penaltycalculation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int max = 0;
        int f = 0;
        int tf = 0;
        int sf = 0;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int t = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            if (max < s) {
                max = s;
                f = i;
                tf = t;
                sf = s;
            }
        }

        if (sf == 0) {
            System.out.println(0);
        } else {
            System.out.println(tf + (f - 1) * 20);
        }
    }
}
