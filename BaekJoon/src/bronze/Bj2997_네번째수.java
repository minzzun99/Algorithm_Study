package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj2997_네번째수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        int a = list.get(1) - list.get(0);
        int b = list.get(2) - list.get(1);

        if (a == b) {
            System.out.println(list.get(2) + a);
        } else if (a > b) {
            System.out.println(list.get(0) + b);
        } else {
            System.out.println(list.get(1) + a);
        }
    }
}
