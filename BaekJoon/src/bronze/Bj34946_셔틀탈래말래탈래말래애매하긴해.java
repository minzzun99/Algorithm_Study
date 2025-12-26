package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj34946_셔틀탈래말래탈래말래애매하긴해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int shuttleTime = A + B;

        if (shuttleTime <= D && C <= D) {
            System.out.println("~.~");
        } else if (shuttleTime > D && C > D) {
            System.out.println("T.T");
        } else if (shuttleTime <= D) {
            System.out.println("Shuttle");
        } else {
            System.out.println("Walk");
        }
    }
}
