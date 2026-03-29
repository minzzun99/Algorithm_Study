package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj35409_제4회디미고프로그래밍챌린지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean canSubmit = isCanSubmit(H, M);

        if (canSubmit) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static boolean isCanSubmit(int H, int M) {
        int currentTime = H * 60 + M;
        boolean canSubmit = false;

        if (isBetween(currentTime, 6, 30, 9, 0) ||
                isBetween(currentTime, 9, 50, 10, 0) ||
                isBetween(currentTime, 10, 50, 11, 0) ||
                isBetween(currentTime, 11, 50, 12, 0) ||
                isBetween(currentTime, 12, 50, 13, 50) ||
                isBetween(currentTime, 14, 40, 14, 50) ||
                isBetween(currentTime, 15, 40, 15, 50) ||
                isBetween(currentTime, 16, 40, 22, 50)) {
            canSubmit = true;
        }
        return canSubmit;
    }

    public static boolean isBetween(int current, int startH, int startM, int endH, int endM) {
        int start = startH * 60 + startM;
        int end = endH * 60 + endM;
        return current >= start && current <= end;
    }
}
