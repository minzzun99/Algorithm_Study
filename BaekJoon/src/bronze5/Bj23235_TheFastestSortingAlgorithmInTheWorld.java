package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj23235_TheFastestSortingAlgorithmInTheWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (true) {
            String str = br.readLine();
            if (str.charAt(0) == '0') {
                break;
            }
            count++;
        }

        for (int i = 1; i <= count; i++) {
            sb.append(String.format("Case %d: Sorting... done!%n", i));
        }

        System.out.println(sb);
    }
}
