package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Bj11557_YangjojangofTheYear {
    static class University {
        String name;
        int drink;

        public University(String name, int drink) {
            this.name = name;
            this.drink = drink;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        ArrayList<University> list;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                list.add(new University(st.nextToken(), Integer.parseInt(st.nextToken())));
            }
            Collections.sort(list, (o1, o2) -> {
                return o2.drink - o1.drink;
            });
            sb.append(list.get(0).name).append('\n');
        }
        System.out.println(sb);
    }
}
