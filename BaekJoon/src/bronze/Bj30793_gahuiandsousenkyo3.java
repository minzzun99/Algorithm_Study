package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30793_gahuiandsousenkyo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        double v = (double) p / r;
        if (v >= 0.6) {
            System.out.println("very strong");
        } else if (v >= 0.4) {
            System.out.println("strong");
        } else if (v >= 0.2) {
            System.out.println("normal");
        } else {
            System.out.println("weak");
        }
    }
}
