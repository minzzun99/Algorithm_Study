package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj32025_수학은체육과목입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int H = Integer.parseInt(br.readLine());
        int W = Integer.parseInt(br.readLine());
        if (H < W) {
            System.out.println(H * 50);
        } else {
            System.out.println(W * 50);
        }
    }
}
