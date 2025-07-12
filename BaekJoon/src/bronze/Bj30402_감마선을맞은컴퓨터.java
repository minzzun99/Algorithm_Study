package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj30402_감마선을맞은컴퓨터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        A : for (int i = 0; i < 15; i++) {
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++ ) {
                if (str.charAt(j) == 'w') {
                    sb.append("chunbae");
                    break A;
                } else if (str.charAt(j) == 'b') {
                    sb.append("nabi");
                    break A;
                } else if (str.charAt(j) == 'g') {
                    sb.append("yeongcheol");
                    break A;
                }
            }
        }

        System.out.println(sb);
    }
}
