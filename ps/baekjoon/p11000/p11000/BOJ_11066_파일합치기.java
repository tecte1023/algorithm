/*
 * 문제: 백준 11066번 - 파일 합치기 (https://www.acmicpc.net/problem/11066)
 * 문제 풀이
 *  작은 구간의 합치기 비용이 큰 구간의 최적해를 결정하는 데 사용되는 최적 부분 구조를 가지므로 Bottom-up 방식의 DP를 적용.
 *  특정 구간을 두 개의 하위 구간으로 나눌 수 있는 모든 경우의 수를 검토하여, 그중 합산 비용이 가장 적은 값으로 갱신.
 *  구간이 합쳐질 때마다 해당 구간의 전체 파일 크기 합이 추가 비용으로 발생하므로, 누적 합 기법을 사용.
 *
 * 시간 복잡도: O(t * n³)
 *  t: 테스트 케이스의 개수
 *  n: 파일의 개수
 */

package baekjoon.p11000.p11000;

import java.io.*;
import java.util.*;

public class BOJ_11066_파일합치기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (testCaseCount-- > 0) {
            int fileCount = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] fileSizes = new int[fileCount + 1];
            int[] prefixSum = new int[fileCount + 1];
            int[][] dp = new int[fileCount + 1][fileCount + 1];

            for (int i = 1; i <= fileCount; i++) {
                fileSizes[i] = Integer.parseInt(st.nextToken());
                prefixSum[i] = prefixSum[i - 1] + fileSizes[i];
            }

            for (int length = 1; length < fileCount; length++) {
                for (int start = 1; start + length <= fileCount; start++) {
                    int end = start + length;
                    int rangeSum = prefixSum[end] - prefixSum[start - 1];

                    dp[start][end] = Integer.MAX_VALUE;

                    for (int mid = start; mid < end; mid++) {
                        int cost = dp[start][mid] + dp[mid + 1][end] + rangeSum;

                        dp[start][end] = Math.min(dp[start][end], cost);
                    }
                }
            }

            sb.append(dp[1][fileCount]).append("\n");
        }

        System.out.print(sb);
    }
}
