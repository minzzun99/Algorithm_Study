package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj6378_디지털루트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }

            while (true) {
                int sum = 0;
                if (input.length() < 2) {
                    break;
                } else {
                    for (int i = 0; i < input.length(); i++) {
                        sum += input.charAt(i) - '0';
                    }
                }
                input = String.valueOf(sum);
            }
            System.out.println(input);
        }
    }
}
