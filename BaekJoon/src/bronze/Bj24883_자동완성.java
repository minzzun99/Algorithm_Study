package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24883_자동완성 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        if (c == 'N' || c == 'n') {
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }
    }
}
