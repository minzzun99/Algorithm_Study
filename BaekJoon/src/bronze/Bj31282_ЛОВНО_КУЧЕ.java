package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj31282_ЛОВНО_КУЧЕ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if(N % (K - M) == 0) {
            System.out.println(N / (K - M));
        }else if(N % (K - M) != 0) {
            System.out.println(N / (K - M) + 1);
        }
    }
}
