/*
 * 문제: 백준 11062번 - 카드 게임 (https://www.acmicpc.net/problem/11062)
 * 문제 풀이
 *  Top-down 방식의 DP를 적용하여 근우가 얻을 수 있는 최대 점수를 구함.
 *  양방향에서 카드를 선택할 수 있으므로 구간 [left, right]를 상태로 정의하고 메모이제이션을 활용함.
 *  근우의 차례에는 가능한 선택지 중 점수가 최대가 되는 방향을 선택하여 값을 누적함.
 *  상대방의 차례에는 근우의 다음 점수가 최소가 되도록 카드를 선택한다는 가정하에 최솟값을 반환받아 상태를 갱신함.
 *
 * 시간 복잡도: O(t * n²)
 *  t: 테스트 케이스의 개수
 *  n: 카드의 개수
 */

package baekjoon.p11000.p11000;

import java.io.*;
import java.util.*;

public class BOJ_11062_카드게임 {
    // public class Main {
    private static int[] cards;
    private static int[][] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (testCase-- > 0) {
            int cardCount = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            cards = new int[cardCount];
            memo = new int[cardCount][cardCount];

            for (int i = 0; i < cardCount; i++) {
                cards[i] = Integer.parseInt(st.nextToken());
            }

            int score = dp(0, cardCount - 1, true);

            sb.append(score).append("\n");
        }

        System.out.print(sb);
    }

    private static int dp(int left, int right, boolean targetTurn) {
        if (left > right) {
            return 0;
        }

        if (memo[left][right] != 0) {
            return memo[left][right];
        }

        if (targetTurn) {
            int pickLeft = dp(left + 1, right, false) + cards[left];
            int pickRight = dp(left, right - 1, false) + cards[right];

            memo[left][right] = Math.max(pickLeft, pickRight);
        } else {
            int pickLeft = dp(left + 1, right, true);
            int pickRight = dp(left, right - 1, true);

            memo[left][right] = Math.min(pickLeft, pickRight);
        }

        return memo[left][right];
    }
}
