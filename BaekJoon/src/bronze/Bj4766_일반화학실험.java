package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4766_일반화학실험 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double now = Double.parseDouble(br.readLine());
        while (true) {
            double input = Double.parseDouble(br.readLine());
            if (input == 999) {
                break;
            }

            sb.append(String.format("%.2f\n", input - now));
            now = input;
        }

        System.out.println(sb);
    }
}
