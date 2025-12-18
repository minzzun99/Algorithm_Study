package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj26731_Zagubionalitera {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        boolean[] arr = new boolean[26];

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            arr[c - 'A'] = true;
        }

        char result = ' ';
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                result = (char) (i + 'A');
                break;
            }
        }

        System.out.println(result);
    }
}
