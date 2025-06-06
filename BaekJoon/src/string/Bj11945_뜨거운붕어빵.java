package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11945_뜨거운붕어빵 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder(br.readLine()).reverse();
            result.append(sb).append('\n');
        }

        System.out.println(result);
    }
}
