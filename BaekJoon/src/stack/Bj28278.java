package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Bj28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int k = Integer.parseInt(st.nextToken());
            if (k == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (k == 2) {
                if (stack.isEmpty()) {
                    sb.append(-1).append('\n');
                }else {
                    sb.append(stack.pop()).append('\n');
                }
            } else if (k == 3) {
                sb.append(stack.size()).append('\n');
            } else if (k == 4) {
                if (stack.isEmpty()) {
                    sb.append(1).append('\n');
                }else {
                    sb.append(0).append('\n');
                }
            } else if (k == 5) {
                if (stack.isEmpty()) {
                    sb.append(-1).append('\n');
                }else {
                    sb.append(stack.peek()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
