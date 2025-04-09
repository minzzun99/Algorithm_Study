package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj14038_TournamentSelection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (int i = 0; i < 6; i++) {
            String str = br.readLine();
            if (str.equals("W")) {
                count++;
            }
        }

        if(count > 4) {
            System.out.println(1);
        } else if(count > 2) {
            System.out.println(2);
        } else if(count > 0) {
            System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }
}