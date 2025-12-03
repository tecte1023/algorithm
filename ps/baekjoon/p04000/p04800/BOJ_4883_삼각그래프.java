/*
 * 문제: 백준 4883번 - 삼각 그래프 (https://www.acmicpc.net/problem/4883)
 * 문제 풀이
 *  DP를 사용하여 위에서 아래로 내려오며 최소 비용을 누적.
 *  그래프 구조상 (r, c) 위치는 이전 행(r-1)의 인접 노드들 뿐만 아니라 현재 행(r)의 바로 왼쪽 노드에서도 진입할 수 있음.
 *  따라서 먼저 위쪽(이전 행)에서 내려오는 경로들의 최솟값을 계산한 뒤, 왼쪽에서 오는 경로와 비교하여 값을 한 번 더 갱신하는 방식을 사용.
 *  전체 그래프를 저장하지 않고, 직전 행의 비용만을 유지하는 방식으로 공간 복잡도를 최적화함.
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p04000.p04800;

import java.io.*;
import java.util.*;

public class BOJ_4883_삼각그래프 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int i = 1; ; i++) {
            int k = Integer.parseInt(br.readLine());

            if (k == 0) {
                break;
            }

            int[] memo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            memo[0] = memo[1];
            memo[2] += memo[1];

            for (int j = 1; j < k; j++) {
                int[] newMemo = new int[3];
                int[] cost = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

                newMemo[0] = cost[0] + Math.min(memo[0], memo[1]);
                newMemo[1] = cost[1] + Math.min(memo[0], Math.min(memo[1], memo[2]));
                newMemo[2] = cost[2] + Math.min(memo[1], memo[2]);
                memo = newMemo.clone();

                newMemo[1] = Math.min(memo[1], cost[1] + memo[0]);
                newMemo[2] = Math.min(memo[2], cost[2] + Math.min(memo[1], cost[1] + memo[0]));
                memo = newMemo;
            }

            sb.append(i).append(". ").append(memo[1]).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
