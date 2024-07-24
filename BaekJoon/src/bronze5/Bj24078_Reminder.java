package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24078_Reminder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        System.out.println(X % 21);
    }
}
