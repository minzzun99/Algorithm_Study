package bitmasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj15787_기차가어둠을헤치고은하수를_비트마스킹 {
    static int N, M, C;
    static StringTokenizer st;
    static int[] train = new int[100001];


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
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            set.add(train[i]);
        }

        return set.size();
    }

    private static void commandOne(int i, int x) {
        train[i] |= 1 << x;
    }

    private static void commandTwo(int i, int x) {
        train[i] &= ~(1 << x);
    }

    private static void commandThree(int i) {
        train[i] = train[i] << 1;
        train[i] &= ~(1 << 21);
    }

    private static void commandFour(int i) {
        train[i] = train[i] >> 1;
        train[i] &= ~1;
    }
}
