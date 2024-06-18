package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj14928_큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        long reslut = 0;
        for (int i = 0; i < N.length(); i++) {
            reslut = (reslut * 10 + (N.charAt(i) - '0')) % 20000303;
        }
        System.out.println(reslut);
    }
}
