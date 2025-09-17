package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj9772_Quadrants {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());

            // (0, 0)이면 AXIS 출력 후 종료
            if (a == 0.0 && b == 0.0) {
                System.out.println("AXIS");
                break;
            }
            // 축 위에 있는 경우
            else if (a == 0.0 || b == 0.0) {
                System.out.println("AXIS");
            }
            // 각 사분면 판별
            else if (a > 0 && b > 0) {
                System.out.println("Q1");
            } else if (a < 0 && b > 0) {
                System.out.println("Q2");
            } else if (a < 0 && b < 0) {
                System.out.println("Q3");
            } else if (a > 0 && b < 0) {
                System.out.println("Q4");
            }
        }
    }
}