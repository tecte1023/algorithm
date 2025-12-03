/*
 * 문제: 백준 32762번 - 더치 페이 (https://www.acmicpc.net/problem/32762)
 *
 * 시간 복잡도: O((n + m) log (n + m))
 */

package ps.baekjoon.p32000.p32700;

import java.io.*;
import java.util.*;

public class BOJ_32762_더치페이 {
    // public class Main {
    private static class Node {
        int t, v, type;

        public Node(int t, int v, int type) {
            this.t = t;
            this.v = v;
            this.type = type;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt((Node a) -> a.t).thenComparingInt(a -> a.type));
        int people = 0;
        double payment = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            pq.offer(new Node(s, 1, 0));
            pq.offer(new Node(e, -1, 2));
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            pq.offer(new Node(t, p, 1));
        }

        while (!pq.isEmpty()) {
            Node node = pq.poll();

            if (node.type == 1) {
                if (people > 0) {
                    payment += node.v;
                }
            } else {
                people += node.v;
            }
        }

        bw.write(Double.toString(payment / n));
        br.close();
        bw.close();
    }
}
