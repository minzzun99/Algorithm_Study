package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long sum = 0;
        int M = 1234567891;
        long pow = 1;
        for (int i = 0; i < L; i++) {
            sum += (str.charAt(i) - 96) * pow;
            pow = (pow * 31) % M;
        }

        long hashing = sum % M;

        System.out.println(hashing);
    }
}
