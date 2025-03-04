package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj14470_전자레인지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        int sum = 0;
        boolean iced = false;
        if (A < 0) {
            iced = true;
        }

        while (true) {
            if (A == B) {
                break;
            }

            if (A < 0) {
                sum += C;
                A++;
            } else if (A == 0 && iced) {
                sum += D;
                iced = false;
            } else {
                sum += E;
                A++;
            }

        }

        System.out.println(sum);
    }
}
