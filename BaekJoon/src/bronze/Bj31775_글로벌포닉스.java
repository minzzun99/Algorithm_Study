package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj31775_글로벌포닉스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = 0;
        int k = 0;
        int p = 0;

        for(int i = 0; i < 3; i++) {
            String input = br.readLine();
            if(input.charAt(0) == 'l') {
                l = 1;
            }else if(input.charAt(0) == 'k') {
                k = 1;
            }else if(input.charAt(0) == 'p') {
                p = 1;
            }
        }

        if(l == 1 && k == 1 && p == 1) {
            System.out.println("GLOBAL");
        }else {
            System.out.println("PONIX");
        }
    }
}
