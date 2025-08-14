package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj32288_바코드닉네임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        for(int i = 0; i<N; i++){
            char c = input.charAt(i);
            if (c == 'I') {
                sb.append("i");
            } else if (c == 'l') {
                sb.append("L");
            }
        }
        System.out.println(sb);
    }
}
