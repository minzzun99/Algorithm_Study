package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4504_배수찾기 {
    private static final String MULTIPLE_FORMAT = "%d is a multiple of %d.\n";
    private static final String NOT_MULTIPLE_FORMAT = "%d is NOT a multiple of %d.\n";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                break;
            }

            if (input % N == 0) {
                sb.append(String.format(MULTIPLE_FORMAT, input, N));
            } else {
                sb.append(String.format(NOT_MULTIPLE_FORMAT, input, N));
            }
        }
        System.out.println(sb);
    }
}
