package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11916_볼질 {
    private static int N;
    private static int score = 0;
    private static boolean first, second, third;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int ballCount = 0;
        while (N-- > 0) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) {
                ballCount++;
            } else if (num == 2) {
                setBase('F');
                ballCount = 0;
            } else {
                setBase('W');
                ballCount++;
            }

            if (ballCount == 4) {
                setBase('F');
                ballCount = 0;
            }
        }

        System.out.println(score);
    }

    private static void setBase(char type) {
        if (type == 'F') {
            if (first) {
                if (second) {
                    if (third) {
                        score++;
                    } else {
                        third = true;
                    }
                } else {
                    second = true;
                }
            } else {
                first = true;
            }
        } else {
            if (third) {
                score++;
                third = false;
            }
            if (second) {
                third = true;
                second = false;
            }
            if (first) {
                second = true;
                first = false;
            }
        }
    }
}
