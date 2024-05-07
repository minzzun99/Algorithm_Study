package ch14_simulation;

public class Problem61 {
    private static int[][] solution(int n) {
        int[][] result = new int[n][n];
        int num = 1;
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // 첫번째 행 채우기
            for (int i = startCol; i <= endCol; i++) {
                result[startRow][i] = num;
                num++;
            }
            startRow++;

            // 마지막 열 채우기
            for (int i = startRow; i <= endRow; i++) {
                result[i][endCol] = num;
                num++;
            }
            endCol--;

            // 마지막 행 채우기
            if (endRow >= startRow) {
                for (int i = endCol; i >= startCol; i--) {
                    result[endRow][i] = num;
                    num++;
                }
                endRow--;
            }

            // 첫번째 열 채우기
            if (endCol >= startCol) {
                for (int i = endRow; i >= startRow; i--) {
                    result[i][startCol] = num;
                    num++;
                }
                startCol++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] result = solution(n);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
