package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34380_BlastersDash {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String VM = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String K = br.readLine();
        System.out.println((20 + n) * 2);
    }
}
