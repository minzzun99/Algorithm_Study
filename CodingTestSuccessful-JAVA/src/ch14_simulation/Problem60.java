package ch14_simulation;

public class Problem60 {
    private static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        // 행렬의 곱을 실행하는 함수
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        // 전치행렬 구현
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    public static int[][] solution(int[][] matrix1, int[][] matrix2) {
        int[][] multiplied = multiplyMatrix(matrix1, matrix2);
        int[][] transpose = transposeMatrix(multiplied);
        return transpose;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}};

        int[][] result = solution(matrix1, matrix2);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
