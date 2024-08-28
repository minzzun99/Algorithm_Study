package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj17362_수학은체육과목입니다2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        switch (N % 8) {
            case 1:
                sb.append("1");
                break;
            case 0, 2:
                sb.append("2");
                break;
            case 3, 7:
                sb.append("3");
                break;
            case 4, 6:
                sb.append("4");
                break;
            case 5:
                sb.append("5");
                break;
        }
        System.out.println(sb);
    }
}
