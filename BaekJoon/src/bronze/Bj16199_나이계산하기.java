package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj16199_나이계산하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int tY = Integer.parseInt(st.nextToken());
        int tM = Integer.parseInt(st.nextToken());
        int tD = Integer.parseInt(st.nextToken());

        int age = tY - y;
        if (y == tY) {
            System.out.println(age);
        } else {
            if (m > tM) {
                System.out.println(age - 1);
            } else if (m == tM) {
                if (d <= tD) {
                    System.out.println(age);
                } else {
                    System.out.println(age - 1);
                }
            } else {
                System.out.println(age);
            }
        }


        System.out.println(age + 1);
        System.out.println(age);
    }
}
