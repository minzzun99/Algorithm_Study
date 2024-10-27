package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5555_반지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String find = br.readLine();

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            input += input;
            if (input.contains(find)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
