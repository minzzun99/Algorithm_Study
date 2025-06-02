package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj4493_가위바위보 {
    private static class Player {
        int score;
        String name;

        public Player(String name) {
            this.score = 0;
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void plusScore() {
            this.score++;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            Player player1 = new Player("Player 1");
            Player player2 = new Player("Player 2");
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String S1 = st.nextToken();
                String S2 = st.nextToken();
                if(S1.equals("R") && S2.equals("P")) {
                    player2.plusScore();
                }else if(S1.equals("R") && S2.equals("S")) {
                    player1.plusScore();
                }else if(S1.equals("P") && S2.equals("R")) {
                    player1.plusScore();
                }else if(S1.equals("P") && S2.equals("S")) {
                    player2.plusScore();
                }else if(S1.equals("S") && S2.equals("R")) {
                    player2.plusScore();
                }else if(S1.equals("S") && S2.equals("P")) {
                    player1.plusScore();
                }
            }

            if(player1.getScore() > player2.getScore()) {
                sb.append(player1.getName()).append('\n');
            } else if (player2.getScore() > player1.getScore()) {
                sb.append(player2.getName()).append('\n');
            } else {
                sb.append("TIE\n");
            }
        }

        System.out.println(sb);
    }
}
