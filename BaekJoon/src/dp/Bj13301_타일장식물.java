package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj13301_타일장식물 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] size = new long[81];
        size[0] = 0;
        size[1] = 4;
        size[2] = 6;
        for (int i = 3; i < size.length; i++) {
            size[i] = size[i - 1] + size[i - 2];
        }

        System.out.println(size[N]);
    }
}
