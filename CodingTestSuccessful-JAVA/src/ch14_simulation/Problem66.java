package ch14_simulation;

public class Problem66 {
    private static int[] up = {0, 1};
    private static int[] down = {0, -1};
    private static int[] left = {-1, 0};
    private static int[] right = {1, 0};
    private static int width, height;
    private static boolean isInBounds(int x, int y, int dx, int dy) {
        if (Math.abs(x + dx) <= width && Math.abs(y + dy) <= height) {
            return true;
        } else {
            return false;
        }
    }



    public static int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0;
        width = board[0] / 2;
        height = board[1] / 2;

        for (String s : keyinput) {
            int dx = 0;
            int dy = 0;
            switch (s) {
                case "up" -> {
                    dx = up[0];
                    dy = up[1];
                }
                case "down" -> {
                    dx = down[0];
                    dy = down[1];
                }
                case "left" -> {
                    dx = left[0];
                    dy = left[1];
                }
                case "right" -> {
                    dx = right[0];
                    dy = right[1];
                }
            }
            if (isInBounds(x, y, dx, dy)) {
                x += dx;
                y += dy;
            }
        }
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        String[] keyInput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};
        int[] arr = solution(keyInput, board);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
