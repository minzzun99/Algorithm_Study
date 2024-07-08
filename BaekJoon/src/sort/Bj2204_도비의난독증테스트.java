package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bj2204_도비의난독증테스트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<String> list;
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                break;
            }
            list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(br.readLine());
            }
            list.sort(String::compareToIgnoreCase);
            sb.append(list.get(0)).append('\n');
        }
        System.out.println(sb);
    }
}
