package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj26258_다중일차함수 {
    private static int N, Q;
    private static ArrayList<Node> list;
    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Node(x, y));
        }

        list.sort((o1,o2) -> {
            return Integer.compare(o1.x, o2.x);
        });



        Q = Integer.parseInt(br.readLine());
        for (int i = 0; i < Q; i++) {
            double k = Double.parseDouble(br.readLine());
            sb.append(find(k)).append('\n');
        }
        System.out.println(sb);
    }

    private static int find(double k) {
        int low = 0;
        int high = N - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (k > list.get(mid).x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        int answer = list.get(low).y - list.get(low - 1).y;

        if (answer < 0) {
            return -1;
        } else if (answer > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
