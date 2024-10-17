package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10599_페르시아의왕들 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] str = br.readLine().split("\\s");
            if (str[0].equals("0") && str[1].equals("0") && str[2].equals("0") && str[3].equals("0")) {
                break;
            }
            sb.append(Integer.parseInt(str[2]) - Integer.parseInt(str[1])).append(" ")
                    .append(Integer.parseInt(str[3]) - Integer.parseInt(str[0])).append('\n');
        }
        System.out.println(sb);
    }
}
