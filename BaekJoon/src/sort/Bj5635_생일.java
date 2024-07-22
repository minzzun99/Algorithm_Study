package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Bj5635_생일 {
    static class Birth {
        String name;
        int day;
        int month;
        int year;
        public Birth(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        ArrayList<Birth> birthList = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            birthList.add(new Birth(name, day, month, year));
        }
        Collections.sort(birthList, (o1, o2) -> {
            if (o1.year == o2.year) {
                if (o1.month == o2.month) {
                    return o1.day - o2.day;
                }
                return o1.month - o2.month;
            }
            return o1.year - o2.year;
        });
        sb.append(birthList.get(birthList.size() - 1).name).append('\n');
        sb.append(birthList.get(0).name).append('\n');
        System.out.println(sb);
    }
}
