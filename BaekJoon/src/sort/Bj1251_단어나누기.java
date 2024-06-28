package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bj1251_단어나누기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<String> list = new ArrayList<>();
        for (int i = 1; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                StringBuilder sb1 = new StringBuilder(str.substring(0, i));
                StringBuilder sb2 = new StringBuilder(str.substring(i, j));
                StringBuilder sb3 = new StringBuilder(str.substring(j));
                StringBuilder resultSb = new StringBuilder();
                resultSb.append(sb1.reverse()).append(sb2.reverse()).append(sb3.reverse());
                list.add(resultSb.toString());
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
