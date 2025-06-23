package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4806_줄세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while (true) {
            String input = br.readLine();
            if(input == null) break;
            count++;
        }
        System.out.println(count);
    }
}
