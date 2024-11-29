package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj12738_가장긴증가하는부분수열3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(st.nextToken()));

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            int value = list.get(list.size() - 1);

            if (num > value) {
                list.add(num);
                continue;
            }

            int left = 0;
            int right = list.size() - 1;
            while (left < right) {
                int mid = (left + right) / 2;
                if (num > list.get(mid)) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            list.set(right, num);
        }

        System.out.println(list.size());
    }
}
