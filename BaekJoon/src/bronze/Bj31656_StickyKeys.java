package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj31656_StickyKeys {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] arr = br.readLine().toCharArray();
        sb.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                continue;
            }
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}
