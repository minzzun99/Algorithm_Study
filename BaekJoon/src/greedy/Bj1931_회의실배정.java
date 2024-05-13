package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1931_회의실배정 {
    public static class Meeting {
        int start, end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Meeting[] arr = new Meeting[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[i] = new Meeting(start, end);
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.end != o2.end) {
                return Integer.compare(o1.end, o2.end);
            } else {
                return Integer.compare(o1.start, o2.start);
            }
        });

        int count = 0;
        int time = 0;       // 현재 시간
        for (int i = 0; i < N; i++) {
            if (time <= arr[i].start) {
                count++;
                time = arr[i].end;
            }
        }

        System.out.println(count);
    }
}
