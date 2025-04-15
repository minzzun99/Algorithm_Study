package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj3276_ICONS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int row = 1;
        int col = 1;
        while (row * col < N) {
            if (row == col) {
                row++;
            } else {
                col++;
            }
        }
        System.out.println(row + " " + col);
    }
}
