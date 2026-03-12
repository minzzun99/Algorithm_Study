package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj17094_SeriousProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int count2 = 0;
        int countE = 0;
        for (char c : s.toCharArray()) {
            if (c == '2') {
                count2++;
                continue;
            }
            countE++;
        }

        if (countE > count2) {
            System.out.println("e");
        } else if (countE < count2) {
            System.out.println("2");
        } else {
            System.out.println("yee");
        }
    }
}
