/*
 * 문제: 백준 17086번 - 아기 상어 2 (https://www.acmicpc.net/problem/17086)
 * 문제 풀이
 *  격자 내의 모든 좌표를 순회하며, 각 칸을 시작점으로 하는 BFS를 매번 수행함.
 *  각 BFS는 대각선을 포함한 8방향으로 탐색을 확장해 나가다가 가장 처음 만나는 아기 상어까지의 거리를 반환함.
 *  구해진 각 칸의 가장 가까운 상어와의 거' 중 최댓값을 갱신.
 *
 * 시간 복잡도: O((n * m)²)
 */

package baekjoon.p17000.p17000;

import java.io.*;
import java.util.*;

public class BOJ_17086_아기상어2 {
    // public class Main {
    private static int n, m;
    private static int[][] grid;
    private static final int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    private static int bfs(Pos p) {
        Queue<Pos> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        queue.offer(p);
        visited[p.x][p.y] = true;

        while (!queue.isEmpty()) {
            Pos pos = queue.poll();

            if (grid[pos.x][pos.y] == 1) {
                return pos.d;
            }

            for (int i = 0; i < 8; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny]) {
                    continue;
                }

                queue.offer(new Pos(nx, ny, pos.d + 1));
                visited[nx][ny] = true;
            }
        }

        return 0;
    }

    private static class Pos {
        int x, y, d;

        public Pos(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dist = 0;

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            grid[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dist = Math.max(dist, bfs(new Pos(i, j, 0)));
            }
        }

        bw.write(Integer.toString(dist));
        br.close();
        bw.close();
    }
}
