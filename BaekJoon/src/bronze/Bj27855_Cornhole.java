package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj27855_Cornhole {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H1 = Integer.parseInt(st.nextToken());
        int B1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int H2 = Integer.parseInt(st.nextToken());
        int B2 = Integer.parseInt(st.nextToken());

        int player1 = (3 * H1) + B1;
        int player2 = (3 * H2) + B2;

        if (player1 > player2) {
            System.out.println("1 " + (player1 - player2));
        } else if (player2 > player1) {
            System.out.println("2 " + (player2 - player1));
        } else {
            System.out.println("NO SCORE");
        }
    }
}
