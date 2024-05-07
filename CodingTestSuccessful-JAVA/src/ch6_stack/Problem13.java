package ch6_stack;

import java.util.Stack;

public class Problem13 {
    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int move : moves) {            // moves 배열을 하나씩 탐색
            for (int j = 0; j < board.length; j++) {        // board 배열에서 0이면 다음 행으로 넘기는 반복문
                if (board[j][move - 1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[j][move - 1]) {
                        stack.pop();
                        result += 2;
                    } else {
                        stack.push(board[j][move - 1]);
                    }
                    board[j][move - 1] = 0;         // 뽑은 인형은 0으로 만들어서 없애줌
                    break;

                }
            }
        }
        return result;
    }
}
