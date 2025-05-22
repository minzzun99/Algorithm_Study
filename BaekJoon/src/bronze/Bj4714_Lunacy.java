package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4714_Lunacy {
    private static final String PRINT_FORMAT = "Objects weighing %.2f on Earth will weigh %.2f on the moon.\n";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            double input = Double.parseDouble(br.readLine());
            if (input < 0) {
                break;
            }

            sb.append(String.format(PRINT_FORMAT, input, input * 0.167));
        }

        System.out.println(sb);
    }
}
