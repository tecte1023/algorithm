/*
 * 문제: 백준 5212번 - 지구 온난화 (https://www.acmicpc.net/problem/5212)
 *
 * 시간 복잡도: O(r * c)
 */

package baekjoon.p05000.p05200;

import java.io.*;
import java.util.*;

public class BOJ_5212_지구온난화 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        char[][] map = new char[r][c];
        char[][] newMap = new char[r][c];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int minX = r - 1;
        int maxX = 0;
        int minY = c - 1;
        int maxY = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < r; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i][j] == '.') {
                    newMap[i][j] = '.';
                    continue;
                }

                int sea = 0;

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx < 0 || nx >= r || ny < 0 || ny >= c || map[nx][ny] == '.') {
                        sea++;
                    }
                }

                if (sea < 3) {
                    newMap[i][j] = 'X';
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                } else {
                    newMap[i][j] = '.';
                }
            }
        }

        for (int i = minX; i <= maxX; i++) {
            for (int j = minY; j <= maxY; j++) {
                sb.append(newMap[i][j]);
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
