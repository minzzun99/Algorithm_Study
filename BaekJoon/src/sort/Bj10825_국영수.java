package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj10825_국영수 {
    private static class Student{
        String name;
        int kr;
        int eng;
        int math;

        public Student(String name, int kr, int eng, int math) {
            this.name = name;
            this.kr = kr;
            this.eng = eng;
            this.math = math;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        ArrayList<Student> stdList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int kr = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            stdList.add(new Student(name, kr, eng, math));
        }

        stdList.sort((o1, o2) -> {
            if (o1.kr == o2.kr) {
                if (o1.eng == o2.eng) {
                    if (o1.math == o2.math) {
                        return (o1.name).compareTo(o2.name);
                    } else {
                        return o2.math - o1.math;
                    }
                } else {
                    return o1.eng - o2.eng;
                }
            } else {
                return o2.kr - o1.kr;
            }
        });

        for (Student std : stdList) {
            sb.append(std.name).append('\n');
        }
        System.out.println(sb);
    }
}
