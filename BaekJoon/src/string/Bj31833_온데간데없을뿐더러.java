package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Bj31833_온데간데없을뿐더러 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger A = new BigInteger(br.readLine().replaceAll(" ", ""));
        BigInteger B = new BigInteger(br.readLine().replaceAll(" ", ""));

        if (A.compareTo(B) <= 0) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }
    }
}
