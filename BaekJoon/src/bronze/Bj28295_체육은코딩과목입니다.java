package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj28295_체육은코딩과목입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 10;
        int direction = 0;
        while (N-- > 0) {
            direction += Integer.parseInt(br.readLine());
        }

        if(direction % 4 == 0) {
            System.out.println("N");
        }else if(direction % 4 == 1) {
            System.out.println("E");
        }else if(direction % 4 == 2) {
            System.out.println("S");
        }else if(direction % 4 == 3) {
            System.out.println("W");
        }
    }
}
