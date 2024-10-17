package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj26041_비슷한전화번호표시 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split("\\s");
        String target = br.readLine();

        int sum = 0;
        for (String s : strArr) {
            if (!target.equals(s)) {
                if (s.startsWith(target)) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
