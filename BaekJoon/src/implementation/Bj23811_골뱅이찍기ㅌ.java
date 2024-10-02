package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj23811_골뱅이찍기ㅌ {
    private static final String A = "@@@@@";
    private static final String B = "@";
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        printPattern(sb, A);
        printPattern(sb, B);
        printPattern(sb, A);
        printPattern(sb, B);
        printPattern(sb, A);

        System.out.println(sb);
    }

    private static void printPattern(StringBuilder sb, String pattern) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(pattern);
            }
            sb.append('\n');
        }
    }
}
