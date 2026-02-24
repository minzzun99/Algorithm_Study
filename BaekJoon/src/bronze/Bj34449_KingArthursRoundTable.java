package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34449_KingArthursRoundTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(br.readLine());
        double w = Double.parseDouble(br.readLine());
        double n = Double.parseDouble(br.readLine());
        if (d * Math.PI >= w * n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
