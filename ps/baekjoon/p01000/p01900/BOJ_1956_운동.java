/*
 * 문제: 백준 1956번 - 운동 (https://www.acmicpc.net/problem/1956)
 * 문제 풀이
 *  모든 정점에서 모든 정점으로의 최단 거리를 구해야 하므로 플로이드-워셜 알고리즘을 이용.
 *  거쳐가는 정점을 기준으로 3중 반복문을 수행하며, 기존의 i에서 j로 가는 거리와 i에서 k를 거쳐 j로 가는 거리를 비교하여 최솟값으로 갱신함.
 *  일반적인 플로이드-워셜과 달리 자기 자신으로 돌아오는 거리를 0으로 초기화하지 않음으로써 사이클의 길이를 자연스럽게 계산.
 *  모든 정점의 자기 자신으로 돌아오는 거리 값 중 가장 작은 값을 찾아 출력하며,
 *  갱신되지 않은 경우은 연결된 사이클이 없는 경우를 의미하므로 -1을 출력.
 *
 * 시간 복잡도: O(v³)
 */

package baekjoon.p01000.p01900;

import java.io.*;
import java.util.*;

public class BOJ_1956_운동 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int[][] dist = new int[v + 1][v + 1];
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= v; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE / 2);
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            dist[a][b] = c;
        }

        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <= v; j++) {
                for (int k = 1; k <= v; k++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        for (int i = 1; i <= v; i++) {
            min = Math.min(min, dist[i][i]);
        }

        bw.write(Integer.toString(min == Integer.MAX_VALUE / 2 ? -1 : min));
        br.close();
        bw.close();
    }
}
