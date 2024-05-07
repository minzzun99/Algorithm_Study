package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj2580_스도쿠 {
    public static class Node {
        int x, y;
        public Node (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int[][] sudoku;

    private static boolean isValid(int num, int row, int col) {
        return !(inRow(num, row) || inCol(num, col) || inBox(num, row, col));
    }

    private static boolean inRow(int num, int row) {
        return Arrays.stream(sudoku[row]).anyMatch(n -> n == num);
    }

    private static boolean inCol(int num, int col) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean inBox(int num, int row, int col) {
        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;

        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (sudoku[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Node findEmpty() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    return new Node(i, j);
                }
            }
        }
        return null;
    }

    private static boolean setSudoku() {
        Node emptyBlock = findEmpty();
        if (emptyBlock == null) {
            return true;
        }

        int empX = emptyBlock.x;
        int empY = emptyBlock.y;

        for (int num = 1; num <= 9; num++) {
            if (isValid(num, empX, empY)) {
                sudoku[empX][empY] = num;
                if (setSudoku()) {
                    return true;
                }
                sudoku[empX][empY] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sudoku = new int[9][9];
        StringTokenizer st;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        setSudoku();

        for (int[] i : sudoku) {
            Arrays.stream(i).forEach(k -> System.out.print(k + " "));
            System.out.println();
        }
    }
}
