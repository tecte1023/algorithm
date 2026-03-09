/*
 * 문제: 백준 2629번 - 양팔저울 (https://www.acmicpc.net/problem/2629)
 * 문제 풀이
 *  추를 구슬의 반대편에 놓거나(더하기), 구슬과 같은 쪽에 놓는(빼기) 모든 경우의 수를 고려하는 Bottom-up 방식의 DP를 적용.
 *  냅색 알고리즘의 응용으로, 1차원 배열을 사용하여 현재까지 측정 가능한 무게 상태를 관리함.
 *  첫 번째 루프에서 추를 추가하여 만들 수 있는 합의 무게를 갱신하고, 두 번째 루프에서 추의 차이를 통해 만들 수 있는 무게를 갱신함.
 *  모든 추를 사용해 가능한 무게 조합을 미리 구한 뒤, 입력받은 각 구슬의 무게가 유효한지 판별.
 *
 * 시간 복잡도: O(n * w)
 *  n: 추의 개수
 *  w: 추들의 최대 총합
 */

package baekjoon.p02000.p02600;

import java.io.*;
import java.util.*;

public class BOJ_2629_양팔저울 {
    // public class Main {
    private static final int MAX_WEIGHT = 40_001;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int weightCount = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] weights = new int[weightCount];

        for (int i = 0; i < weightCount; i++) {
            weights[i] = Integer.parseInt(st.nextToken());
        }

        boolean[] dp = new boolean[MAX_WEIGHT];

        dp[0] = true;

        for (int weight : weights) {
            for (int i = dp.length - 1; i >= weight; i--) {
                dp[i] |= dp[i - weight];
            }
        }

        for (int weight : weights) {
            for (int i = 0; i < dp.length - weight; i++) {
                dp[i] |= dp[i + weight];
            }
        }

        int beadCount = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < beadCount; i++) {
            int bead = Integer.parseInt(st.nextToken());

            sb.append(dp[bead] ? 'Y' : 'N').append(" ");
        }

        System.out.print(sb);
    }
}
