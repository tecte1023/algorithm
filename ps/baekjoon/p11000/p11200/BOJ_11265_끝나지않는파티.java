/*
 * 문제: 백준 11265번 - 끝나지 않는 파티 (https://www.acmicpc.net/problem/11265)
 * 문제 풀이
 * 정점 쌍 사이의 최단 경로를 구해야 하므로 플로이드 워셜 알고리즘을 사용.
 * 3중 반복문(경유지 k → 출발지 i → 도착지 j)을 수행하여, 특정 파티장을 경유해서 가는 시간이 기존 경로보다 짧다면 최단 거리 테이블을 갱신.
 * 모든 경로에 대한 전처리가 끝난 후, 각 손님의 요청마다 미리 계산된 최단 시간이 c 이하인지 확인하여 결과를 출력.
 *
 * 시간 복잡도: O(n³)
 */

package baekjoon.p11000.p11200;

import java.io.*;
import java.util.*;

public class BOJ_11265_끝나지않는파티 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int[][] graph = new int[n + 1][n + 1];
        int[][] dist = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {
                graph[i][j] = dist[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            sb.append(dist[a][b] > c ? "Stay here\n" : "Enjoy other party\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
