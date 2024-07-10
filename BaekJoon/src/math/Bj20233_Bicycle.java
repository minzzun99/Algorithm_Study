package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj20233_Bicycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        int sumA, sumB;
        if (T - 30 > 0) {
            sumA = ((T - 30) * x * 21) + a;
        } else {
            sumA = a;
        }

        if (T - 45 > 0) {
            sumB = ((T - 45) * y * 21) + b;
        } else {
            sumB = b;
        }
        sb.append(sumA).append(' ').append(sumB);
        System.out.println(sb);
    }
}
