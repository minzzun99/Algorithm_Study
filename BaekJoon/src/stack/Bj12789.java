package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Bj12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int order = 1;

        for(int i = 0; i < N; i++) {
            if(arr[i] != order) {
                if (!stack.isEmpty() && stack.peek() == order) {
                    stack.pop();
                    order++;
                    i--;
                }else {
                    stack.push(arr[i]);
                }
            }else {
                order++;
            }
        }

        boolean result = true;
        for (int i = 0; i < stack.size(); i++) {
            if(stack.peek() == order) {
                stack.pop();
                order++;
            }else {
                result = false;
                break;
            }
        }

        if (result) {
            sb.append("Nice");
        } else {
            sb.append("Sad");
        }
        System.out.println(sb);
    }
}
