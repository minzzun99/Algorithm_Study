package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj18691_PokemonBuddy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int result = 0;
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int G = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            if (G == 1) {
                result = E - C;
            } else if (G == 2) {
                result = (E - C) * 3;
            } else if (G == 3) {
                result = (E - C) * 5;
            }

            if (C >= E) {
                result = 0;
            }
            System.out.println(result);
        }
    }
}
