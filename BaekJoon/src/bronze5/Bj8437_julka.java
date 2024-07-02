package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Bj8437_julka {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        BigInteger Klaudia = a.add(b).divide(BigInteger.valueOf(2));
        BigInteger Natalia = a.subtract(b).divide(BigInteger.valueOf(2));

        System.out.println(Klaudia);
        System.out.println(Natalia);
    }
}