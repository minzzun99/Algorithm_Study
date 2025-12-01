package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34813_공통교육과정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char subject = input.charAt(0);
        switch (subject) {
            case 'F' -> System.out.println("Foundation");
            case 'C' -> System.out.println("Claves");
            case 'V' -> System.out.println("Veritas");
            case 'E' -> System.out.println("Exploration");
        }
    }
}
