package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj29823_PakirobotManhattanis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int nCount = 0;
        int sCount = 0;
        int eCount = 0;
        int wCount = 0;
        for (char c : arr) {
            if (c == 'N') {
                nCount++;
            } else if (c == 'S') {
                sCount++;
            } else if (c == 'E') {
                eCount++;
            } else {
                wCount++;
            }
        }

        System.out.println(Math.abs(nCount - sCount) + Math.abs(eCount - wCount));
    }
}
