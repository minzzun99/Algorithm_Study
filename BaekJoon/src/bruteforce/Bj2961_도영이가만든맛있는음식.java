package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj2961_도영이가만든맛있는음식 {
    private static int min = Integer.MAX_VALUE;
    private static List<Ingredient> list;
    private static int N;
    private static boolean[] selected;

    private static class Ingredient {
        int S;
        int B;

        Ingredient(int S, int B) {
            this.S = S;
            this.B = B;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        list = new ArrayList<>();
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int S = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            list.add(new Ingredient(S, B));
        }

        calculate(0, 1, 0, 0);
        System.out.println(min);
    }

    private static void calculate(int depth, int s, int b, int count) {
        if (depth == N) {
            if (count != 0) {
                min = Math.min(min, Math.abs(s - b));
            }
            return;
        }

        calculate(depth + 1, s * list.get(depth).S, b + list.get(depth).B, count + 1);
        calculate(depth + 1, s, b, count);
    }
}
