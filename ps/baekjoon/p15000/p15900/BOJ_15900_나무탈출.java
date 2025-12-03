/*
 * 문제: 백준 15900번 - 나무 탈출 (https://www.acmicpc.net/problem/15900)
 * 문제 풀이
 * 리프 노드에 있는 말이 부모 노드로 한 칸 이동할 때마다 루트까지의 남은 거리가 1씩 줄어듦.
 * 따라서 모든 리프 노드에서 루트까지의 거리의 총합이 전체 턴 수가 됨.
 * DFS로 루트부터 탐색하여 모든 리프 노드의 깊이를 합산하고, 그 총합이 홀수인지 짝수인지 구함.
 *
 * 시간 복잡도: O(n)
 */

package ps.baekjoon.p15000.p15900;

import java.io.*;
import java.util.*;

public class BOJ_15900_나무탈출 {
    // public class Main {
    private static final List<List<Integer>> graph = new ArrayList<>();
    private static int cnt = 0;

    private static void dfs(int n, int p, int l) {
        for (int child : graph.get(n)) {
            if (child == p) {
                continue;
            }

            dfs(child, n, l + 1);
        }

        if (graph.get(n).size() == 1) {
            cnt += l;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        dfs(1, 0, 0);
        bw.write(cnt % 2 == 0 ? "No" : "Yes");
        br.close();
        bw.close();
    }
}
