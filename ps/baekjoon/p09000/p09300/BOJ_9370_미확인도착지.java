/*
 * 문제: 백준 9370번 - 미확인 도착지 (https://www.acmicpc.net/problem/9370)
 *  모든 간선의 가중치를 2배로 늘리고, 반드시 지나야 하는 간선의 가중치만 1을 빼서 홀수로 만듦.
 *  가중치를 2배로 하면 모든 최단 경로는 짝수가 되지만, 특정 간선을 한 번이라도 포함하면 전체 경로의 합이 홀수가 됨.
 *  다익스트라로 최단 거리를 구한 뒤, 목적지까지의 최단 거리가 홀수인 경우만 정답으로 간주.
 *
 * 시간 복잡도: O(t * m log n)
 *  t: 테스트 케이스 개수
 */

package baekjoon.p09000.p09300;

import java.io.*;
import java.util.*;

public class BOJ_9370_미확인도착지 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            List<List<Edge>> graph = new ArrayList<>();
            int[] dist = new int[n + 1];
            PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.w));
            boolean[] candidates = new boolean[n + 1];
            int min = 0;
            Set<Integer> destinations = new TreeSet<>();

            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
                dist[i] = 100_000_000;
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());

                d = (a == g && b == h || a == h && b == g) ? d * 2 - 1 : d * 2;
                graph.get(a).add(new Edge(b, d));
                graph.get(b).add(new Edge(a, d));
            }

            for (int i = 0; i < t; i++) {
                candidates[Integer.parseInt(br.readLine())] = true;
            }

            dist[s] = 0;
            pq.offer(new Edge(s, 0));

            while (!pq.isEmpty()) {
                Edge edge = pq.poll();

                if (edge.w > dist[edge.to]) {
                    continue;
                }

                for (Edge next : graph.get(edge.to)) {
                    int nd = edge.w + next.w;

                    if (nd < dist[next.to]) {
                        dist[next.to] = nd;
                        pq.offer(new Edge(next.to, nd));
                    }
                }
            }

            for (int i = 1; i <= n; i++) {
                if (candidates[i] && dist[i] % 2 == 1) {
                    sb.append(i).append(" ");
                }
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static class Edge {
        int to, w;

        public Edge(int to, int w) {
            this.to = to;
            this.w = w;
        }
    }
}
