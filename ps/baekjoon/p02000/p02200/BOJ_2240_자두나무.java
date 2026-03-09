/*
 * 문제: 백준 2240번 - 자두나무 (https://www.acmicpc.net/problem/2240)
 * 문제 풀이
 *  매초 자두가 떨어지는 위치와 현재 이동 횟수를 상태로 관리하는 Bottom-up 방식의 DP를 적용.
 *  이동 횟수를 뒤에서부터 순회하여 이전 시간대의 데이터를 안전하게 참조함.
 *  이동 횟수가 짝수이면 1번 나무, 홀수이면 2번 나무에 위치한다는 규칙을 활용하여 현재 위치와 자두가 떨어지는 나무를 비교.
 *  현재 위치에서 대기하는 경우와 다른 나무에서 이동해오는 경우 중 최댓값을 선택하여 자두 획득 여부를 합산.
 *
 * 시간 복잡도: O(t * w)
 *  t: 자두가 떨어지는 시간
 *  w: 최대 이동 횟수
 */

package baekjoon.p02000.p02200;

import java.io.*;
import java.util.*;

public class BOJ_2240_자두나무 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalTime = Integer.parseInt(st.nextToken());
        int maxMoves = Integer.parseInt(st.nextToken());
        int[] dp = new int[maxMoves + 1];
        int maxPlum = 0;

        for (int time = 1; time <= totalTime; time++) {
            int tree = Integer.parseInt(br.readLine());

            for (int moves = maxMoves; moves >= 0; moves--) {
                int currentTree = (moves % 2 == 0) ? 1 : 2;
                int score = (currentTree == tree) ? 1 : 0;

                if (moves > 0) {
                    dp[moves] = Math.max(dp[moves], dp[moves - 1]);
                }

                dp[moves] += score;
            }
        }

        for (int count : dp) {
            maxPlum = Math.max(maxPlum, count);
        }

        System.out.print(maxPlum);
    }
}
