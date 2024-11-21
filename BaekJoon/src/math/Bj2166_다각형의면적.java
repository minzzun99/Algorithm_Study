package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj2166_다각형의면적 {
    private static List<Node> list;

    private static class Node {
        long x;
        long y;

        Node(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            list.add(new Node(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())));
        }
        list.add(list.get(0));

        System.out.printf("%.1f", getResult());
    }

    private static double getResult() {
        long sumA = 0;
        long sumB = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            long x1 = list.get(i).x;
            long y1 = list.get(i).y;
            long x2 = list.get(i + 1).x;
            long y2 = list.get(i + 1).y;

            sumA += x1 * y2;
            sumB += y1 * x2;
        }

        return Math.abs(sumA - sumB) / 2.0;
    }
}
