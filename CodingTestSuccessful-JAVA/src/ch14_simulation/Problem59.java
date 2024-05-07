package ch14_simulation;

public class Problem59 {
    private static int[][] rotate(int[][] arr) {
        int N = arr.length;
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = arr[N - 1 - j][i];
            }
        }
        return result;
    }

    public static int[][] solution(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr = rotate(arr);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        arr = solution(arr, 1);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
