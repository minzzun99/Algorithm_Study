package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj25640_MBTI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mbti = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        while (N-- > 0) {
            if (mbti.equals(br.readLine())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
