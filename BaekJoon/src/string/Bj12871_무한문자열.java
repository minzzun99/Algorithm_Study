package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj12871_무한문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();

        int sLength = S.length();
        int tLength = T.length();
        int size = lcm(sLength, tLength);

        StringBuilder sBuilder = new StringBuilder();
        StringBuilder tBuilder = new StringBuilder();

        while (sBuilder.length() < size) {
            sBuilder.append(S);
        }

        while (tBuilder.length() < size) {
            tBuilder.append(T);
        }

        if (sBuilder.toString().equals(tBuilder.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static int lcm(int sLength, int tLength) {
        int gcd = gcd(sLength, tLength);

        return sLength * tLength / gcd;
    }

    private static int gcd(int sLength, int tLength) {
        if (sLength % tLength == 0) {
            return tLength;
        }

        return gcd(tLength, sLength % tLength);
    }
}
