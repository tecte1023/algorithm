/*
 * 문제: 백준 2293번 - 동전 1 (https://www.acmicpc.net/problem/2293)
 * 문제 풀이
 *  Bottom-up 방식의 DP를 사용하여 목표 금액을 만드는 모든 경우의 수를 구함.
 *  동전의 종류별로 순차적으로 루프를 돌며, 이전 동전들로 만든 경우의 수에 현재 동전을 추가하는 방식으로 상태를 누적.
 *  금액을 정방향으로 순회함으로써 동일한 동전을 여러 번 선택하는 중복 조합을 처리함.
 *  1차원 배열을 사용하여 현재 금액에서 현재 동전 값을 뺀 이전 상태의 경우의 수를 합산하며 갱신.
 *
 * 시간 복잡도: O(n * k)
 *  n: 동전의 종류
 *  k: 목표 금액
 */

package baekjoon.p02000.p02200;

import java.io.*;
import java.util.*;

public class BOJ_2293_동전1 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int coinCount = Integer.parseInt(st.nextToken());
        int targetAmount = Integer.parseInt(st.nextToken());
        int[] dp = new int[targetAmount + 1];

        dp[0] = 1;

        while (coinCount-- > 0) {
            int coin = Integer.parseInt(br.readLine());

            for (int amount = coin; amount <= targetAmount; amount++) {
                dp[amount] += dp[amount - coin];
            }
        }

        System.out.print(dp[targetAmount]);
    }
}
