package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10995_별찍기20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0) {
                    sb.append('*').append(' ');
                } else {
                    sb.append(' ').append('*');
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
