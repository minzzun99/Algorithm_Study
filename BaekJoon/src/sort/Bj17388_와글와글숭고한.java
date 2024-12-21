package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj17388_와글와글숭고한 {
    private static class University {
        String name;
        int num;

        University(String name, int num) {
            this.name = name;
            this.num = num;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<University> list = new ArrayList<>();
        list.add(new University("Soongsil", Integer.parseInt(st.nextToken())));
        list.add(new University("Korea", Integer.parseInt(st.nextToken())));
        list.add(new University("Hanyang", Integer.parseInt(st.nextToken())));
        Collections.sort(list, (o1, o2) -> Integer.compare(o1.num, o2.num));
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += list.get(i).num;
        }

        if (sum < 100) {
            System.out.println(list.get(0).name);
        } else {
            System.out.println("OK");
        }

    }
}
