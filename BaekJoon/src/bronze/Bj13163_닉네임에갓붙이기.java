package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13163_닉네임에갓붙이기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] arr = br.readLine().split(" ");
            sb.append("god");
            for(int i = 1; i < arr.length; i++) {
                sb.append(arr[i]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
