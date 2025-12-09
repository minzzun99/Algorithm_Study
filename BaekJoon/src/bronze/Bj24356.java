package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj24356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());

        int time1 = t1 * 60 + m1;
        int time2 = t2 * 60 + m2;

        int resultTime = 0;
        int count = 0;

        if (time1 > time2) {
            resultTime = (time2 + 60 * 24) - time1;
            count = (resultTime - resultTime % 30) / 30;
        } else if (time1 < time2) {
            resultTime = time2 - time1;
            count = (resultTime - resultTime % 30) / 30;
        }

        System.out.println(resultTime + " " + count);
    }
}
