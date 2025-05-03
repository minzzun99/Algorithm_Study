package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13136_DoNotTouchAnything {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long R = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());

        long row = 0;
        long col = 0;
        if (R % N == 0){
            row = R / N;
        }else{
            row = (R / N) + 1;
        }

        if (C % N == 0){
            col = C / N;
        }else{
            col = (C / N) + 1;
        }

        System.out.println(row * col);
    }
}
