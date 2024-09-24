package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj15996_팩토리얼나누기 {
    private static int N, A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());

        int count = 0;
        long X = A;
        while (X <= N) {
            count += (int) (N / X);
            X *= A;
        }

        System.out.println(count);
    }
}
