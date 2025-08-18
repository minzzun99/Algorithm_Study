package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13580_Andandonotempo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A == B || A == C || B == C) {
            System.out.println("S");
        }else if(A + B == C || A + C == B || B + C == A) {
            System.out.println("S");
        }else {
            System.out.println("N");
        }
    }
}
