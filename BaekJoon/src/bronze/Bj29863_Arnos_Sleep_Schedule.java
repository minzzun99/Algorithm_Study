package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj29863_Arnos_Sleep_Schedule {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        if(20 <= N && N <= 23) {
            System.out.println(24 - N + M);
        }else {
            System.out.println(M - N);
        }
    }
}
