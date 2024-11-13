package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj3449_해밍거리 {
    private static final String PRINT_MESSAGE = "Hamming distance is %d.%n";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String A = br.readLine();
            String B = br.readLine();
            sb.append(compareString(A, B));
        }

        System.out.println(sb);
    }

    private static String compareString(String A, String B) {
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                count++;
            }
        }

        return String.format(PRINT_MESSAGE, count);
    }
}
