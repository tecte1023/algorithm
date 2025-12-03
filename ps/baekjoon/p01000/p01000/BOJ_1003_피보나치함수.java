/*
 * 문제: 백준 1003번 - 피보나치 함수 (https://www.acmicpc.net/problem/1003)
 * 문제 풀이
 *  DP를 사용한 풀이.
 *  입력 n의 최댓값이 40으로 작으므로, 매 케이스마다 계산하는 대신
 *  0부터 40까지의 0과 1의 등장 횟수를 미리 계산하여 배열에 저장.
 *
 * 시간 복잡도: O(n + t)
 */

package baekjoon.p01000.p01000;

import java.io.*;

public class BOJ_1003_피보나치함수 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[][] memo = new int[2][41];
        StringBuilder sb = new StringBuilder();

        memo[0][0] = memo[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            memo[0][i] = memo[0][i - 1] + memo[0][i - 2];
            memo[1][i] = memo[1][i - 1] + memo[1][i - 2];
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            sb.append(memo[0][n]).append(" ").append(memo[1][n]).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
