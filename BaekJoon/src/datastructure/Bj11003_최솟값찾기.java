package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj11003_최솟값찾기 {
    private static class Number {
        int num;
        int idx;

        Number(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Deque<Number> deque = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            while (!deque.isEmpty() && deque.peekLast().num >= num) {
                deque.pollLast();
            }

            deque.addLast(new Number(num, i));
            if (deque.peekFirst().idx < i - (L - 1)) {
                deque.pollFirst();
            }
            sb.append(deque.peekFirst().num).append(' ');
        }

        System.out.println(sb);
    }
}
