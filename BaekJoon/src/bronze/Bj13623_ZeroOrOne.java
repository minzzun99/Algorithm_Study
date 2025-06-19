package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13623_ZeroOrOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        if (B == C && A != B) {
            System.out.println("A");
        } else if (A == C && A != B) {
            System.out.println("B");
        } else if (A == B && A != C) {
            System.out.println("C");
        } else {
            System.out.println("*");
        }
    }
}
