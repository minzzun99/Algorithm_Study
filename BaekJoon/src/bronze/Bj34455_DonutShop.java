package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34455_DonutShop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        while (E-- > 0) {
            String symbol = br.readLine();
            int Q = Integer.parseInt(br.readLine());

            if (symbol.equals("+")) {
                D += Q;
            } else {
                D -= Q;
            }
        }

        System.out.println(Math.max(0, D));
    }
}
