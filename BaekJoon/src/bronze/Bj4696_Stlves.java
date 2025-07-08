package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4696_Stlves {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double total = 0;
        while (true) {
            double input = Double.parseDouble(br.readLine());
            if(input == 0){
                break;
            }

            total += input;
            total += input * input;
            total += input * input * input;
            total += input * input * input * input;
            total += 1;
            sb.append(String.format("%.2f", total)).append('\n');
            total = 0;
        }

        System.out.println(sb);
    }
}
