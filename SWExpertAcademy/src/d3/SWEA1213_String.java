package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1213_String {
    private static final String PRINT_FORMAT = "#%d %d%n";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            br.readLine();
            String a = br.readLine();
            String b = br.readLine();
            sb.append(String.format(PRINT_FORMAT, i, find(a, b)));
        }

        System.out.println(sb);
    }

    private static int find(String a, String b) {
        int count = 0;
        for (int i = 0; i <= b.length() - a.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(i + j)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count++;
            }
        }

        return count;
    }
}
