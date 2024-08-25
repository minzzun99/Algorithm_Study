package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj17413_단어뒤집기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        boolean flag = false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                flag = true;
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(str.charAt(i));
            } else if (str.charAt(i) == '>') {
                flag = false;
                sb.append(str.charAt(i));
            } else if (flag) {
                sb.append(str.charAt(i));
            } else if (!flag) {
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(str.charAt(i));
                } else {
                    stack.push(str.charAt(i));
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}
