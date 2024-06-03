package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Bj4134_다음소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            BigInteger prime = new BigInteger(br.readLine());
            if (prime.isProbablePrime(10)) {
                sb.append(prime).append('\n');
            }else {
                sb.append(prime.nextProbablePrime()).append('\n');
            }
        }
        System.out.println(sb);
    }
}
