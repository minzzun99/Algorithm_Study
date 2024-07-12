package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj23301_스터디시간정하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int[] arr = new int[1001];
        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());

                for (int x = start; x < end; x++) {
                    arr[x]++;
                }
            }
        }

        int startIdx = 0;
        int endIdx = 0;
        int max = 0;
        for (int i = 0; i <= arr.length - T; i++) {
            int sum = 0;
            for (int j = i; j < i + T; j++) {
                sum += arr[j];
            }
            if (sum > max) {
                max = sum;
                startIdx = i;
                endIdx = i + T;
            }
        }
        System.out.println(startIdx + " " + endIdx);
    }
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        boolean[][] arr = new boolean[N][1001];
        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());

                for (int x = start; x < end; x++) {
                    arr[i][x] = true;
                }
            }
        }

        int startIdx = 0;
        int endIdx = 0;
        int max = 0;
        for (int i = 0; i <= 1001 - T; i++) {
            int sum = 0;
            for (int k = 0; k < N; k++) {
                for (int j = i; j < i + T; j++) {
                    if (arr[k][j]) {
                        sum++;
                    }
                }
            }
            if (sum > max) {
                max = sum;
                startIdx = i;
                endIdx = i + T;
            }
        }
        System.out.println(startIdx + " " + endIdx);
    }*/
}
