package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj27918_탁구경기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int X = 0;
        int Y = 0;
        while (N-- > 0) {
            String input = br.readLine();
            if (Math.abs(X - Y) == 2) {
                break;
            }

            if (input.equals("D")) {
                X++;
            } else {
                Y++;
            }
        }
        System.out.println(X + ":" + Y);
    }
}
