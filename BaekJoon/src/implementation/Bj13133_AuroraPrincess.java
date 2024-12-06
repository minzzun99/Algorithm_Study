package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj13133_AuroraPrincess {
    private static int[] mom;
    private static int[] dad;
    private static boolean[] dead;
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        mom = new int[N + 1];
        dad = new int[N + 1];
        dead = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            mom[i] = Integer.parseInt(st.nextToken());
            dad[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            dead[num] = true;
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (mom[i] == 0 || dad[i] == 0 || dead[mom[i]] || dead[dad[i]] || dead[i]) {
                continue;
            }
            count++;
        }

        System.out.println(count);
    }
}
