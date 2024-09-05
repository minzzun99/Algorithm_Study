package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2755_이번학기평점은몇점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][3];

        double sum = 0;
        double totalCredit = 0;

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            arr[i][0] = input[0];
            arr[i][1] = input[1];
            arr[i][2] = input[2];
        }

        for (int i = 0; i < N; i++) {
            double temp = 0;

            String score = arr[i][2];
            if (score.charAt(0) == 'A') temp = 4;
            if (score.charAt(0) == 'B') temp = 3;
            if (score.charAt(0) == 'C') temp = 2;
            if (score.charAt(0) == 'D') temp = 1;
            if (score.charAt(0) == 'F') temp = 0;

            if (score.length() > 1) {
                if (score.charAt(1) == '+') temp += 0.3;
                if (score.charAt(1) == '-') temp -= 0.3;
            }

            sum += Integer.parseInt(arr[i][1]) * temp;
            totalCredit += Integer.parseInt(arr[i][1]);
        }

        System.out.println(String.format("%.2f", sum / totalCredit));
    }
}
