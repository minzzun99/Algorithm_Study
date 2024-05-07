package ch11_graph;

import java.util.ArrayDeque;

public class Problem41_미제출 {
    public static class Node {
        int x, y, direction, cost;      // x좌표, y좌표, 방향, 비용

        public Node(int x, int y, int direction, int cost) {
            this.x = x;
            this.y = y;
            this.direction = direction;
            this.cost = cost;
        }
    }

    private static final int[] rx = {0, -1, 0, 1};
    private static final int[] ry = {-1, 0, 1, 0};
    private static int N;
    private static int[][][] visited;

    // 주어진 좌표가 범위 내에 있는지 확인
    private static boolean isValid(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }
    // 주어진 좌표가 차단되었거나 이동할 수 없는지 확인
    private static boolean isBlocked(int[][] board, int x, int y) {
        return (x == 0 && y == 0) || !isValid(x, y) || board[x][y] == 1;
    }

    // 이전 방향과 현재 방향에 따라 비용 계산
    private static int calculateCost(int direction, int prevDirection, int cost) {
        if (prevDirection == -1 || (prevDirection - direction) % 2 == 0) {
            return cost + 100;
        }
        return cost + 600;
    }

    // 주어진 좌표와 방향이 아직 방문하지 않았거나 새 비용이 더 작은 경우
    private static boolean isShouldUpdate(int x, int y, int direction, int newCost) {
        return visited[x][y][direction] == 0 || visited[x][y][direction] > newCost;
    }


    public int solution(int[][] board) {
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.add(new Node(0, 0, -1, 0));
        N = board.length;
        visited = new int[N][N][4];

        int answer = Integer.MAX_VALUE;

        // 큐가 빌때까지 반복
        while (!deque.isEmpty()) {
            Node now = deque.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + rx[i];
                int ny = now.y + ry[i];

                if (isBlocked(board, nx, ny)) {
                    continue;
                }

                int new_Cost = calculateCost(i, now.direction, now.cost);
                // 도착지에 도달한 경우 최소비용 업데이트
                if (nx == N - 1 && ny == N - 1) {
                    answer = Math.min(answer, new_Cost);
                }
                // 좌표와 방향이 아직 방문하지 않았거나 새 비용이 더 작은경우 큐에 추가
                else if (isShouldUpdate(nx, ny, i, new_Cost)) {
                    deque.add(new Node(nx, ny, i, new_Cost));
                    visited[nx][ny][i] = new_Cost;
                }
            }
        }
        return answer;
    }
}
