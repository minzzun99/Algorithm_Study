package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bj1758_알바생강호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Long.parseLong(br.readLine()));
        }
        Collections.sort(list, Collections.reverseOrder());

        long max = 0;
        for (int i = 0; i < N; i++) {
            long tip = list.get(i) - i;
            if (tip <= 0) {
                continue;
            }
            max += tip;
        }

        System.out.println(max);
    }
}
