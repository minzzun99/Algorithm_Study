package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj26768_H4x0r {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replaceAll("a", "4")
                .replaceAll("e", "3")
                .replaceAll("i", "1")
                .replaceAll("o", "0")
                .replaceAll("s", "5");
        System.out.println(str);
    }
}
