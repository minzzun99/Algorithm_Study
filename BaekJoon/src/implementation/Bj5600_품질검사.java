package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj5600_품질검사 {
    private static int[] checkA;
    private static int[] checkB;
    private static int[] checkC;
    private static int[] checkResult;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = a + b + c;
        int[] arr = new int[sum + 1];
        Arrays.fill(arr, -1);
        int N = Integer.parseInt(br.readLine());
        checkA = new int[N];
        checkB = new int[N];
        checkC = new int[N];
        checkResult = new int[N];

        for (int x = 0; x < N; x++) {
            st = new StringTokenizer(br.readLine(), " ");
            checkA[x] = Integer.parseInt(st.nextToken());
            checkB[x] = Integer.parseInt(st.nextToken());
            checkC[x] = Integer.parseInt(st.nextToken());
            checkResult[x] = Integer.parseInt(st.nextToken());
            if (checkResult[x] == 1) {
                arr[checkA[x]] = 1;
                arr[checkB[x]] = 1;
                arr[checkC[x]] = 1;
            }
        }

        for (int i = 0; i < N; i++) {
            if (checkResult[i] == 0) {
                int idx = arr[checkA[i]] + arr[checkB[i]] + arr[checkC[i]];
                if (idx == 1) {
                    if (arr[checkA[i]] == -1) {
                        arr[checkA[i]] = 0;
                    } else if(arr[checkB[i]] == -1) {
                        arr[checkB[i]] = 0;
                    } else if (arr[checkC[i]] == -1) {
                        arr[checkC[i]] = 0;
                    }
                }
            }
        }

        for (int i = 1; i <= sum; i++) {
            if(arr[i] == -1) {
                arr[i] = 2;
            }
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
}
