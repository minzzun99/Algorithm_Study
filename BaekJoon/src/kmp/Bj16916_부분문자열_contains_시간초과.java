package kmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj16916_부분문자열_contains_시간초과 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String P = br.readLine();
        if (S.contains(P)) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}

