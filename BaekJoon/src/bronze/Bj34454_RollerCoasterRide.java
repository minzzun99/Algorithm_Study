package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34454_RollerCoasterRide {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        if (C * P >= N) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
