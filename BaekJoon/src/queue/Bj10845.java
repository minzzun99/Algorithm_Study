package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Bj10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            if (str.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                queue.add(x);
            } else if (str.equals("pop")) {
                if(queue.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                  sb.append(queue.poll()).append('\n');
                }
            } else if (str.equals("size")) {
                sb.append(queue.size()).append('\n');
            } else if (str.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else if (str.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue.peekFirst()).append('\n');
                }
            } else {
                if (queue.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue.peekLast()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
