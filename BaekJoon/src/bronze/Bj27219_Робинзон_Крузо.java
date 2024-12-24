package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj27219_Робинзон_Крузо {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int vCount = N / 5;
        int iCount = N % 5;

        for (int i = 0; i < vCount; i++) {
            sb.append('V');
        }

        for (int i = 0; i < iCount; i++) {
            sb.append('I');
        }

        System.out.println(sb);
    }
}
