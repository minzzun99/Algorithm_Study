package priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj11000_강의실배정 {
    private static class Course {
        int start;
        int end;

        Course(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Course[] Courses = new Course[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            Courses[i] = new Course(start, end);
        }

        Arrays.sort(Courses, (o1, o2) -> {
            if (o1.start == o2.start) {
                return o1.end - o2.end;
            } else {
                return o1.start - o2.start;
            }
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(Courses[0].end);

        for (int i = 1; i < N; i++) {
            if (pq.peek() <= Courses[i].start) {
                pq.poll();
            }
            pq.add(Courses[i].end);
        }

        System.out.println(pq.size());
    }
}
