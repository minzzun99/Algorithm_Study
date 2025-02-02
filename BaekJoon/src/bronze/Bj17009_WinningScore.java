package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj17009_WinningScore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int apples = 0;
        int bananas = 0;
        for (int j = 3; j >= 1; j--) {
            apples += j * Integer.parseInt(br.readLine());
        }
        for (int j = 3; j >= 1; j--) {
            bananas += j * Integer.parseInt(br.readLine());
        }

        if (bananas > apples) {
            System.out.println("B");
        } else if (bananas < apples) {
            System.out.println("A");
        } else {
            System.out.println("T");
        }
    }
}
