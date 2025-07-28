package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj21734_SMUPC의등장 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            for (int j = 0; j < getValue(c); j++) {
                sb.append(c);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static int getValue(int cNum) {
        int sum = 0;
        while (cNum > 0) {
            sum += cNum % 10;
            cNum /= 10;
        }
        return sum;
    }
}
