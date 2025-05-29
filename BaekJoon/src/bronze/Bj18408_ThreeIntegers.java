package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj18408_ThreeIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int one = 0;
        int two = 0;
        for (int i = 0; i < 3; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (input == 1) {
                one++;
            } else {
                two++;
            }
        }

        if (one > two) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
