package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj17499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int Q = Integer.parseInt(st1.nextToken());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int startIndex = 0;

        for (int j = 0; j < Q; j++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
            int k = Integer.parseInt(st3.nextToken());
            if(k == 1) {
                int i = Integer.parseInt(st3.nextToken());
                int x = Integer.parseInt(st3.nextToken());
                int index = (N + startIndex + (i - 1)) % N;
                arr[index] += x;
            }else if(k == 2) {
                int s = Integer.parseInt(st3.nextToken());
                //수열을 오른쪽으로 시프트 하니깐 시작인덱스는 왼쪽으로
                startIndex = (N + startIndex - s) % N;
            }else {
                int s = Integer.parseInt(st3.nextToken());
                //수열을 왼쪽으로 시프트 하니깐 시작인덱스는 오른쪽으로
                startIndex = (N + startIndex + s) % N;
            }
        }
        for (int i = startIndex; i < N; i++) {
            sb.append(arr[i]).append(' ');
        }
        for (int i = 0; i < startIndex; i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);
    }
}
