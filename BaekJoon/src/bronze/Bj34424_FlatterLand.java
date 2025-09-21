package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34424_FlatterLand {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((Integer.parseInt(br.readLine()) - 1) * Integer.parseInt(br.readLine()));
    }
}
