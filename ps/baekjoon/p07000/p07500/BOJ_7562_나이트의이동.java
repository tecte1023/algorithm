/*
 * 문제: 백준 7562번 - 나이트의 이동 (https://www.acmicpc.net/problem/7562)
 *
 * 시간 복잡도: O(l * l)
 */

package baekjoon.p07000.p07500;

import java.io.*;
import java.util.*;

public class BOJ_7562_나이트의이동 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int l = Integer.parseInt(br.readLine());
            Pos start = new Pos(br.readLine());
            Pos end = new Pos(br.readLine());
            boolean[][] visited = new boolean[l][l];
            Queue<Pos> queue = new LinkedList<>();
            int[][] dir = {{-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}};

            queue.offer(start);
            visited[start.x][start.y] = true;

            while (!queue.isEmpty()) {
                Pos pos = queue.poll();

                if (pos.x == end.x && pos.y == end.y) {
                    sb.append(pos.dist).append("\n");
                    break;
                }

                for (int[] d : dir) {
                    int nx = pos.x + d[0];
                    int ny = pos.y + d[1];

                    if (nx < 0 || nx >= l || ny < 0 || ny >= l || visited[nx][ny]) {
                        continue;
                    }

                    queue.offer(new Pos(nx, ny, pos.dist + 1));
                    visited[nx][ny] = true;
                }
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static class Pos {
        int x, y, dist;

        public Pos(String str) {
            StringTokenizer st = new StringTokenizer(str);

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            dist = 0;
        }

        public Pos(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}
