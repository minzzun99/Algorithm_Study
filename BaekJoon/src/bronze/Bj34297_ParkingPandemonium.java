package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34297_ParkingPandemonium {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        System.out.println(M * C);
    }
}
