package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Bj1755_숫자놀이 {
    private static String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    private static class Number {
        int number;
        String str;

        Number(int number, String str) {
            this.number = number;
            this.str = str;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        StringBuilder sb2;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        ArrayList<Number> list = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            sb = new StringBuilder();
            String str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                sb.append(number[str.charAt(j) - '0']).append(' ');
            }
            list.add(new Number(i, sb.toString()));
        }

        Collections.sort(list, (o1, o2) -> {
            return o1.str.compareTo(o2.str);
        });

        sb2 = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb2.append(list.get(i).number).append(' ');
            if ((i + 1) % 10 == 0) {
                sb2.append('\n');
            }
        }

        System.out.println(sb2);
    }
}
