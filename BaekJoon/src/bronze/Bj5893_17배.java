package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Stack;

public class Bj5893_17배 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine(), 2); // 이진수로 읽기
        N = N.multiply(BigInteger.valueOf(17));          // 17배
        System.out.println(N.toString(2));               // 2진수로 출력
    }
}
