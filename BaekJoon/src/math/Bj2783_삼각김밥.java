package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2783_삼각김밥 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double X = Double.parseDouble(st.nextToken());
        double Y = Double.parseDouble(st.nextToken());
        double min = X / Y;
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            double nx = Double.parseDouble(st.nextToken());
            double ny = Double.parseDouble(st.nextToken());
            double result = nx / ny;
            min = Math.min(min, result);
        }

        System.out.printf("%.2f", min * 1000);
    }
}
