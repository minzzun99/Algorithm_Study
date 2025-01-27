package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Bj30664_LoteriaFalha {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BigInteger A = new BigInteger(br.readLine());

        while(A.compareTo(BigInteger.valueOf(0)) != 0) {
            if(A.remainder(BigInteger.valueOf(42)).compareTo(BigInteger.valueOf(0)) == 0) {
                sb.append("PREMIADO\n");
            }else {
                sb.append("TENTE NOVAMENTE\n");
            }
            A = new BigInteger(br.readLine());
        }

        System.out.println(sb);
    }
}