package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2765_자전거속도 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 1;
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double A = Double.parseDouble(st.nextToken());
            double B = Double.parseDouble(st.nextToken());
            double C = Double.parseDouble(st.nextToken());
            if(B == 0) {
                break;
            }

            C = (C / 60) / 60;
            double dist = ((((A * 3.1415927) * B) / 12) / 5280);
            double MPH = (dist / C);

            System.out.print("Trip #" + T + ": ");
            System.out.printf(String.format("%.2f %.2f\n", dist, MPH));
            T++;
        }
    }
}
