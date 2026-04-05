package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj27239_Шахматная_доска {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = 0;
        char C;
        if(N % 8 != 0) {
            M = N / 8 + 1;
            C = (char)(N % 8 + 96);
        }else {
            M = N / 8;
            C = 'h';
        }

        System.out.println(C + "" + M);
    }
}
