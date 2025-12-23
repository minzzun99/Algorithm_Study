package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34945_채플이너무해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine()) + 2;
        if (x >= 8) {
            System.out.println("Success!");
        } else {
            System.out.println("Oh My God!");
        }
    }
}
