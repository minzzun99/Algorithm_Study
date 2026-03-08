package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34306_MClimbRoad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int W = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int result = (W * 5280) / N;
        System.out.println(result);
    }
}
