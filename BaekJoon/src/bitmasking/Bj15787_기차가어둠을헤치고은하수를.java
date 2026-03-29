package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj15787_기차가어둠을헤치고은하수를 {
    static int N, M, C;
    static StringTokenizer st;
    static boolean[][] train = new boolean[100001][21];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            C = Integer.parseInt(st.nextToken());
            if (C == 1 || C == 2) {
                int i = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                if (C == 1) {
                    commandOne(i, x);
                    continue;
                }
                commandTwo(i, x);
                continue;
            }
            int i = Integer.parseInt(st.nextToken());
            if (C == 3) {
                commandThree(i);
                continue;
            }
            commandFour(i);
        }

        System.out.println(countTrain());
    }

    private static int countTrain() {
        Set<String> result = new HashSet<>();
        StringBuilder sb;
        for (int i = 1; i <= N; i++) {
            sb = new StringBuilder();
            for (int j = 1; j <= 20; j++) {
                if (train[i][j]) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
            result.add(sb.toString());
        }

        return result.size();
    }

    private static void commandOne(int i, int x) {
        if (!train[i][x]) {
            train[i][x] = true;
        }
    }

    private static void commandTwo(int i, int x) {
        if (train[i][x]) {
            train[i][x] = false;
        }
    }

    private static void commandThree(int i) {
        boolean[] temp = new boolean[21];
        for (int k = 1; k <= 19; k++) {
            temp[k + 1] = train[i][k];
        }

        for (int k = 1; k <= 20; k++) {
            train[i][k] = temp[k];
        }
    }

    private static void commandFour(int i) {
        boolean[] temp = new boolean[21];
        if (train[i][1]) {
            train[i][1] = false;
        }

        for (int k = 20; k >= 2; k--) {
            temp[k - 1] = train[i][k];
        }

        for (int k = 1; k <= 20; k++) {
            train[i][k] = temp[k];
        }
    }
}
