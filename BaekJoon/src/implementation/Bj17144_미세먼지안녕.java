package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Bj17144_미세먼지안녕 {
    private static int R, C, T;
    private static int[][] room;
    private static int[][] nextRoom;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static List<Node> airPurifier;

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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        airPurifier = new ArrayList<>();
        room = new int[R][C];
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < C; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
                if (room[i][j] == -1) {
                    airPurifier.add(new Node(i, j));
                }
            }
        }

        while (T-- > 0) {
            nextRoom = new int[R][C];
            spreadDust();
            for (int i = 0; i < R; i++) {
                room[i] = nextRoom[i].clone();
            }

            runAirPurifier();
        }
        System.out.println(countDust());
    }

    private static void spreadDust() {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (room[i][j] == 0) {
                    continue;
                }

                if (room[i][j] == -1) {
                    nextRoom[i][j] = -1;
                    continue;
                }

                int spreadAmount = room[i][j] / 5;
                int count = 0;
                for (int d = 0; d < 4; d++) {
                    int nx = i + dx[d];
                    int ny = j + dy[d];
                    if (isValid(nx, ny)) {
                        nextRoom[nx][ny] += spreadAmount;
                        count++;
                    }
                }
                nextRoom[i][j] = nextRoom[i][j] + room[i][j] - (count * spreadAmount);
            }
        }
    }

    private static void runAirPurifier() {
        Node top = airPurifier.get(0);
        Node bot = airPurifier.get(1);

        moveTopDust(top.x, top.y);
        moveBotDust(bot.x, bot.y);
    }

    private static void moveTopDust(int x, int y) {
        // 옆으로 움직이는거
        for (int i = 0; i < C - 1; i++) {
            int now = nextRoom[x][i];
            if (now == -1) {
                room[x][i + 1] = 0;
                continue;
            }

            room[x][i + 1] = now;
        }

        // 위로 움직이는거
        for (int i = x; i > 0; i--) {
            int now = nextRoom[i][C - 1];
            if (now == -1) {
                room[i - 1][C - 1] = 0;
                continue;
            }

            room[i - 1][C - 1] = now;
        }

        // 왼쪽으로 움직이는거
        for (int i = C - 1; i > 0; i--) {
            int now = nextRoom[0][i];
            if (now == -1) {
                room[0][i - 1] = 0;
                continue;
            }

            room[0][i - 1] = now;
        }

        // 아래쪽으로 움직이는거
        for (int i = 0; i < x; i++) {
            int now = nextRoom[i][0];
            if (now == -1) {
                room[i + 1][0] = 0;
                continue;
            }

            room[i + 1][0] = now;
        }

        room[x][y] = -1;
    }

    private static void moveBotDust(int x, int y) {
        // 옆으로 움직이는거
        for (int i = 0; i < C - 1; i++) {
            int now = nextRoom[x][i];
            if (now == -1) {
                room[x][i + 1] = 0;
                continue;
            }

            room[x][i + 1] = now;
        }

        // 아래쪽으로 움직이는거
        for (int i = x; i < R - 1; i++) {
            int now = nextRoom[i][C - 1];
            if (now == -1) {
                room[i + 1][C - 1] = 0;
                continue;
            }

            room[i + 1][C - 1] = now;
        }

        // 왼쪽으로 움직이는거
        for (int i = C - 1; i > 0; i--) {
            int now = nextRoom[R - 1][i];
            if (now == -1) {
                room[R - 1][i - 1] = 0;
                continue;
            }

            room[R - 1][i - 1] = now;
        }

        // 위로 움직이는거
        for (int i = R - 1; i > x; i--) {
            int now = nextRoom[i][0];
            if (now == -1) {
                room[i - 1][0] = 0;
                continue;
            }

            room[i - 1][0] = now;
        }

        room[x][y] = -1;
    }

    private static boolean isValid(int x, int y) {
        return 0 <= x && x < R && 0 <= y && y < C && room[x][y] >= 0;
    }

    private static int countDust() {
        int count = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (room[i][j] == -1 || room[i][j] == 0) {
                    continue;
                }
                count += room[i][j];
            }
        }
        return count;
    }
}
