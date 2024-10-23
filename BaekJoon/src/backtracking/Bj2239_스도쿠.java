package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2239_스도쿠 {
    private static int[][] board = new int[9][9];

    private static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            String line = br.readLine();

            for (int j = 0; j < 9; j++) {
                board[i][j] = line.charAt(j) - '0';
            }
        }

        setBoard();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(board[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    private static boolean setBoard() {
        Node empty = findEmptyNode();
        if (empty == null) {
            return true;
        }

        int empX = empty.x;
        int empY = empty.y;

        for (int num = 1; num <= 9; num++) {
            if (isValid(empX, empY, num)) {
                board[empX][empY] = num;
                if (setBoard()) {
                    return true;
                }
                board[empX][empY] = 0;
            }
        }
        return false;
    }

    private static boolean isValid(int row, int col, int num) {
        return !(inRow(row, num) || inCol(col, num) || inBox(row, col, num));
    }

    private static boolean inRow(int row, int num) {
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean inCol(int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean inBox(int row, int col, int num) {
        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;

        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (board[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }


    private static Node findEmptyNode() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    return new Node(i, j);
                }
            }
        }

        return null;
    }
}
