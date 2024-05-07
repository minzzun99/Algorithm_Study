package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj2580_스도쿠_다시풀기 {
    public static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static int[][] arr = new int[9][9];

    private static boolean isValid(int row, int col, int num) {
        return !(inRow(row, num) || inCol(col, num) || inBox(row, col, num));
    }

    private static boolean inRow(int row, int num) {
        return Arrays.stream(arr[row]).anyMatch(n -> n == num);
    }

    private static boolean inCol(int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == num) {
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
                if (arr[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Node isEmpty() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] == 0) {
                    return new Node(i, j);
                }
            }
        }
        return null;
    }

    private static boolean setSudoku() {
        Node empty = isEmpty();
        if (empty == null) {
            return true;
        }
        int empX = empty.x;
        int empY = empty.y;

        for (int num = 1; num <= 9; num++) {
            if (isValid(empX, empY, num)) {
                arr[empX][empY] = num;
                if (setSudoku()) {
                    return true;
                }
                arr[empX][empY] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int[] x : arr) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < 9; i++) {
                x[i] = Integer.parseInt(st.nextToken());
            }
        }
        setSudoku();

        for (int[] i : arr) {
            Arrays.stream(i).forEach(k -> System.out.print(k + " "));
            System.out.println();
        }
    }
}
