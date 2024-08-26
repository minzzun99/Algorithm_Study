package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30987_하루피부과 {
    private static int a, b, c, d, e, integral_a, integral_b, integral_c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        integral_a = a / 3;
        integral_b = (b - d) / 2;
        integral_c = c - e;

        int result = 0;
        result = getLaserPower(x2) - getLaserPower(x1);
        System.out.println(result);
    }

    private static int getLaserPower(int x) {
        int integral = (integral_a * (int) Math.pow(x, 3)) + (integral_b * (int) Math.pow(x, 2)) + (integral_c * x);
        return integral;
    }
}
