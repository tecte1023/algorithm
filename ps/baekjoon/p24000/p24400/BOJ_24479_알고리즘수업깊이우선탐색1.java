/*
 * 문제: 백준 24479번 - 알고리즘 수업 - 깊이 우선 탐색 1 (https://www.acmicpc.net/problem/24479)
 *
 * 시간 복잡도: O(m log m)
 */

package baekjoon.p24000.p24400;

import java.io.*;
import java.util.*;

public class BOJ_24479_알고리즘수업깊이우선탐색1 {
    // public class Main {
    private static final List<PriorityQueue<Integer>> graph = new ArrayList<>();
    private static int[] visited;
    private static int order = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            graph.add(new PriorityQueue<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).offer(v);
            graph.get(v).offer(u);
        }

        visited = new int[n + 1];
        dfs(r);

        for (int i = 1; i <= n; i++) {
            sb.append(visited[i]).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static void dfs(int node) {
        PriorityQueue<Integer> pq = graph.get(node);

        visited[node] = order++;

        while (!pq.isEmpty()) {
            int next = pq.poll();

            if (visited[next] == 0) {
                dfs(next);
            }
        }
    }
}
