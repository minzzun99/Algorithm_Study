package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj28691_정보보호학부동아리소개 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        if (c == 'M') {
            System.out.println("MatKor");
        } else if (c == 'W') {
            System.out.println("WiCys");
        } else if (c == 'C') {
            System.out.println("CyKor");
        } else if (c == 'A') {
            System.out.println("AlKor");
        } else {
            System.out.println("$clear");
        }
    }
}
