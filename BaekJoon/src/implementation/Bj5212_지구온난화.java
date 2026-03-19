package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj5212_지구온난화 {
    private final static int[] dx = {-1, 1, 0, 0};
    private final static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        char[][] arr = new char[R][C];
        char[][] after = new char[R][C];

        for (int i = 0; i < R; i++) {
            String input = br.readLine();
            arr[i] = input.toCharArray();
            after[i] = input.toCharArray();
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] == '.') {
                    continue;
                }

                int count = countSea(arr, i, j);
                if (count >= 3) {
                    after[i][j] = '.';
                }
            }
        }


        System.out.println(changePrintFormat(after));
    }

    private static int countSea(char[][] arr, int x, int y) {
        int count = 0;
        for (int i = 0; i < dx.length; i++) {
            int afterX = x + dx[i];
            int afterY= y + dy[i];
            if (!validateRange(arr, afterX, afterY) || arr[afterX][afterY] == '.') {
                count++;
            }
        }

        return count;
    }

    private static boolean validateRange(char[][] arr, int x, int y) {
        return x < arr.length && x >= 0 && y >= 0 && y < arr[0].length;
    }

    private static String changePrintFormat(char[][] after) {
        int minX = 11;
        int maxX = 0;
        int minY = 11;
        int maxY = 0;
        for (int i = 0; i < after.length; i++) {
            for (int j = 0; j < after[i].length; j++) {
                if (after[i][j] == 'X') {
                    minX = Math.min(i, minX);
                    minY = Math.min(j, minY);
                    maxX = Math.max(i, maxX);
                    maxY = Math.max(j, maxY);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = minX; i <= maxX; i++) {
            for (int j = minY; j <= maxY; j++) {
                sb.append(after[i][j]);
            }
            sb.append('\n');
        }

        return sb.toString();
    }
}
