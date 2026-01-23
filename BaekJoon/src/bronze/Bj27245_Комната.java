package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj27245_Комната {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());
        if (Math.min(w, l) / h >= 2 && Math.max(w, l) / Math.min(w, l) <= 2) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }
}
