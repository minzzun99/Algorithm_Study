package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10203_CountVowels {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0){
            String s = br.readLine();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                        || s.charAt(i) == 'u') {
                    count++;
                }
            }

            sb.append(String.format("The number of vowels in %s is %d.%n", s, count));
        }
        System.out.println(sb);
    }
}
