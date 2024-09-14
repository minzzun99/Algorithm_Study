package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Bj1918_후위표기식 {
    private static Map<Character, Integer> operatorMap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        setOperatorMap();

        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);

            if (now == '*' || now == '/' || now == '+' || now == '-') {
                while (!stack.isEmpty() && operatorMap.get(stack.peek()) >= operatorMap.get(now)) {
                    sb.append(stack.pop());
                }
                stack.push(now);
            } else if (now == '(') {
                stack.push(now);
            } else if (now == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            } else {
                sb.append(now);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }

    private static void setOperatorMap() {
        operatorMap = new HashMap<>();
        operatorMap.put('*', 2);
        operatorMap.put('/', 2);
        operatorMap.put('+', 1);
        operatorMap.put('-', 1);
        operatorMap.put('(', 0);
        operatorMap.put(')', 0);
    }
}
