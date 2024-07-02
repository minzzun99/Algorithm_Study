package adhoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj29757_트리긋기 {
    private static class Point {
        int x;
        int y;
        int num;
        public Point(int x, int y, int num) {
            this.x = x;
            this.y = y;
            this.num = num;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Point[] arr = new Point[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Point(x, y, i + 1);
        }
        Arrays.sort(arr, (o1,o2) -> {
            if (o1.x == o2.x) {
                return Integer.compare(o2.y, o1.y);
            } else {
                return Integer.compare(o1.x, o2.x);
            }
        });

        for (int i = 0; i < N-1; i++) {
            sb.append(arr[i].num).append(" ").append(arr[i + 1].num).append('\n');
        }
        System.out.println(sb);
    }
}
