package ch6_stack;

import java.util.Arrays;
import java.util.Stack;

public class Problem14 {
    public String solution(int n, int k, String[] cmd) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int size = n;           // 현재 표의 크기
        for(String s : cmd) {
            char c = s.charAt(0);
            switch (c) {
                case 'U':
                    k -= Integer.valueOf(s.substring(2));
                    break;
                case 'D':
                    k += Integer.valueOf(s.substring(2));
                    break;
                case 'C':
                    stack.push(k);
                    size--;
                    if (k == size) {
                        k--;
                    }
                    break;
                case 'Z':
                    int val = stack.pop();
                    if (val <= k) {
                        k++;
                    }
                    size++;
                    break;
            }
        }
        for (int i = 0; i < size; i++) {
            sb.append('O');
        }
        while (!stack.isEmpty()) {
            sb.insert(stack.pop().intValue(), 'X');
        }
        return sb.toString();
    }



    //쾨테합격자 책 풀이
    /*public String solution(int n, int k, String[] cmd) {
        // 삭제된 행의 인덱스 저장
        Stack<Integer> deleted = new Stack<>();
        // 각 행을 기준으로 연산에 따른 위치를 표시하기 위한 배열
        int[] up = new int[n + 2];
        int[] down = new int[n + 2];

        for (int i = 0; i < n + 2; i++) {
            up[i] = i - 1;
            down[i] = i - 1;
        }

        k++;  //현재 위치를 나타내는 인덱스 가상 공간이 있기 때문에

        for (String c : cmd) {
            if (c.startsWith("C")) {
                deleted.push(k);
                up[down[k]] = up[k];
                down[up[k]] = down[k];
                k = n < down[k] ? up[k] : down[k];
            } else if (c.startsWith("Z")) {
                int restore = deleted.pop();
                down[up[restore]] = restore;
                up[down[restore]] = restore;
            }else {
                String[] s = c.split(" ");
                int x = Integer.parseInt(s[1]);

                for (int i = 0; i < x; i++) {
                    k = s[0].equals("U") ? up[k] : down[k];
                }
            }
        }
        char[] answer = new char[n];
        Arrays.fill(answer, 'O');
        for (int i : deleted) {
            answer[i - 1] = 'X';
        }
        return new String(answer);
    }*/
}
