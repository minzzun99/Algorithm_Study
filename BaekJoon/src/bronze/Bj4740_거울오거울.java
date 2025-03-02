package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4740_거울오거울 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        while (true) {
            String str = br.readLine();
            if (str.equals("***")) {
                break;
            }
            sb = new StringBuilder();
            sb.append(str).reverse();
            System.out.println(sb);
        }
    }
}
