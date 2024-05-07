package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            boolean balanced = true;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        balanced = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        balanced = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (balanced && stack.isEmpty()) {
                sb.append("yse").append('\n');
            } else {
                sb.append("no").append('\n');
            }
        }
        System.out.println(sb);
    }
}