package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj33845_PNUPC에한번도빠지지않고출연한산지니가새삼대단하다고느껴지네 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();
        for (int i = 0; i < S.length(); i++) {
            T = T.replaceAll(String.valueOf(S.charAt(i)), "");
        }
        System.out.println(T);
    }
}
