/*
 * 문제: 백준 11657번 - 타임머신 (https://www.acmicpc.net/problem/11657)
 * 문제 풀이
 *  벨만-포드 알고리즘을 사용하여, 모든 간선을 확인하며 최단 거리를 갱신함.
 *  만약 n번째 반복에서도 거리 값이 갱신된다면, 이는 그래프 내에 음의 사이클이 존재함을 의미.
 *
 * 시간 복잡도: O(n * m)
 */

package baekjoon.p11000.p11600;

import java.io.*;
import java.util.*;

public class BOJ_11657_타임머신 {
    // public class Main {
    private static final ArrayList<Edge> edges = new ArrayList<>();
    private static long[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            edges.add(new Edge(a, b, c));
        }

        dist = new long[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[1] = 0;

        if (bellmanFord(n)) {
            sb.append(-1);
        } else {
            for (int i = 2; i <= n; i++) {
                sb.append(dist[i] == Long.MAX_VALUE ? -1 : dist[i]).append("\n");
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static boolean bellmanFord(int n) {
        for (int i = 1; i <= n; i++) {
            for (Edge e : edges) {
                long nw = dist[e.f] + e.w;

                if (dist[e.f] != Long.MAX_VALUE && nw < dist[e.t]) {
                    dist[e.t] = nw;

                    if (i == n) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static class Edge {
        int f, t, w;

        public Edge(int f, int t, int w) {
            this.f = f;
            this.t = t;
            this.w = w;
        }
    }
}
