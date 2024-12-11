package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj32929_UOS문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = {'S', 'U', 'O'};
        int x = Integer.parseInt(br.readLine());
        System.out.println(arr[x % 3]);
    }
}
