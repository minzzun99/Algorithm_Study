package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj1015_수열정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
            arr2[i] = arr1[i];
        }

        Arrays.sort(arr2);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(arr1[i] == arr2[j]) {
                    sb.append(j).append(" ");
                    arr2[j] = -1;
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
