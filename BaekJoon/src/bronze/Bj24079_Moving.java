package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24079_Moving {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        int Z = Integer.parseInt(br.readLine());
        if (X + Y <= Z) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
