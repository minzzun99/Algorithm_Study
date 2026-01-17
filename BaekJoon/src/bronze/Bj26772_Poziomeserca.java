package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Bj26772_Poziomeserca {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> heart = List.of(
                " @@@   @@@ ",
                "@   @ @   @",
                "@    @    @",
                "@         @",
                " @       @ ",
                "  @     @  ",
                "   @   @   ",
                "    @ @    ",
                "     @     "
        );

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(heart.get(i));
                if (j != N - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
