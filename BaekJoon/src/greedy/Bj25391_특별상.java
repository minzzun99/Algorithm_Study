package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Bj25391_특별상 {
    private static class Student {
        int aScore;
        int bScore;

        Student(int aScore, int bScore) {
            this.aScore = aScore;
            this.bScore = bScore;
        }
    }

    private static int N, M, K;
    private static ArrayList<Student> students;
    private static long sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        students = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            students.add(new Student(a, b));
        }

        Collections.sort(students, (o1, o2) -> Integer.compare(o2.bScore, o1.bScore));
        HashSet<Student> selected = new HashSet<>();

        for (int i = 0; i < K; i++) {
            sum += students.get(i).aScore;
            selected.add(students.get(i));
        }

        Collections.sort(students, (o1, o2) -> Integer.compare(o2.aScore, o1.aScore));
        int count = 0;

        for (Student student : students) {
            if (count == M) {
                break;
            }

            if (!selected.contains(student)) {
                sum += student.aScore;
                count++;
            }
        }

        System.out.println(sum);
    }
}
