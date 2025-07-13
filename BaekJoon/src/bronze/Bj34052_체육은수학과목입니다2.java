package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34052_체육은수학과목입니다2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 1800;
        for (int i = 0; i < 4; i++) {
            sum -= Integer.parseInt(br.readLine());
        }

        if (sum - 300 < 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
