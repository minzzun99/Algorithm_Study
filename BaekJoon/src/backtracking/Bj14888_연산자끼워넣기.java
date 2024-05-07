package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj14888_연산자끼워넣기 {
    private static int N;
    private static int[] number;
    private static int[] operator;
    private static int MAX = Integer.MIN_VALUE;
    private static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        number = new int[N];
        operator = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }
        dfs(number[0], 1);
        System.out.println(MAX);
        System.out.println(MIN);
    }

    private static void dfs(int num, int index) {
        if(index == N) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;
                switch (i) {
                    case 0: {
                        dfs(num + number[index], index + 1);
                        break;
                    }
                    case 1: {
                        dfs(num - number[index], index + 1);
                        break;
                    }
                    case 2: {
                        dfs(num * number[index], index + 1);
                        break;
                    }
                    case 3: {
                        dfs(num / number[index], index + 1);
                        break;
                    }
                }
                operator[i]++;
            }
        }
    }
}
