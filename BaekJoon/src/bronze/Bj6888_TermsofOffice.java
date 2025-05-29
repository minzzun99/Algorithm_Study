package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj6888_TermsofOffice {
    private static final String FORMAT = "All positions change in year %d\n";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        for (int i = X; i <= Y; i = i + 60) {
            sb.append(String.format(FORMAT, i));
        }
        System.out.println(sb);
    }
}
