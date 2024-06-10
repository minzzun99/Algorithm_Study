package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj14710_고장난시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (isPossible(h, m)) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }
    }

    private static boolean isPossible(int h, int m) {
        int num = h % 30;
        if (num * 12 == m) {
            return true;
        } else {
            return false;
        }
    }
}

// 360 = 0
// 180 = 6
// 30 = 1

// 1시간당 30칸이 주어지는데 분침은 한시간에 360을 돌아야함 한칸당 12