package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5357_Dedupe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            char[] arr = br.readLine().toCharArray();
            sb.append(arr[0]);
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] != arr[j]) {
                    sb.append(arr[j]);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
