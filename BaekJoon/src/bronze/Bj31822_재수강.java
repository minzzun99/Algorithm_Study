package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj31822_재수강 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String subject = br.readLine().substring(0, 5);

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        while (N-- > 0) {
            String input = br.readLine().substring(0, 5);
            if (subject.equals(input)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
