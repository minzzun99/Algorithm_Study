package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj17211_좋은날싫은날 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int mood = Integer.parseInt(st.nextToken());
        double[] per = new double[4];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            per[i] = Double.parseDouble(st.nextToken());
        }
        double good;
        double bad;
        if (mood == 0) {
            good = per[0];
            bad = per[1];
        } else {
            good = per[2];
            bad = per[3];
        }
        for (int i = 2; i <= N; i++) {
            good = (good * per[0]) + (bad * per[2]);
            bad = 1 - good;
        }

        System.out.printf("%.0f",good * 1000);
        System.out.println();
        System.out.printf("%.0f",bad * 1000);
    }
}
