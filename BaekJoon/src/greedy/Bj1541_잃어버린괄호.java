package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1541_잃어버린괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MAX_VALUE;
        StringTokenizer stSubtract = new StringTokenizer(br.readLine(), "-");

        while (stSubtract.hasMoreTokens()) {
            int temp = 0;
            StringTokenizer stAdd = new StringTokenizer(stSubtract.nextToken(), "+");
            while (stAdd.hasMoreElements()) {
                temp += Integer.parseInt(stAdd.nextToken());
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
