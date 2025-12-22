package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj6311_IBM빼기1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++) {
            char[] arr = br.readLine().toCharArray();
            StringBuilder result = new StringBuilder();
            for (int j = 0; j < arr.length; j++) {
                int c = (char) ((int) arr[j]) + 1;
                if (c > 90) {
                    c = 65;
                }
                result.append((char) c);
            }

            sb.append(String.format("String #%d%n", i));
            sb.append(result).append('\n').append('\n');
        }
        System.out.println(sb);
    }
}
