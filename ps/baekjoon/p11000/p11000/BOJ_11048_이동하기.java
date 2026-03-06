/*
 * 문제: 백준 11048번 - 이동하기 (https://www.acmicpc.net/problem/11048)
 * 문제 풀이
 *  DP를 사용하여 최대 사탕 개수를 구함.
 *  이동 방향이 오른쪽, 아래, 오른쪽 아래 대각선으로 제한되어 있으므로,
 *  현재 칸의 최댓값은 왼쪽 칸, 위쪽 칸, 왼쪽 위 대각선 칸의 결과 중 하나에 영향을 받음.
 *  하지만 왼쪽 위 대각선 칸은 어차피 왼쪽이나 위쪽 칸을 거쳐 오는 경로보다 클 수 없으므로, 실제로는 왼쪽과 위쪽 칸만 비교해도 무방함.
 *
 * 시간 복잡도: O(n * m)
 */

package baekjoon.p11000.p11000;

import java.io.*;
import java.util.*;

public class BOJ_11048_이동하기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] memo = new int[m + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= m; j++) {
                memo[j] = Math.max(memo[j - 1], memo[j]) + Integer.parseInt(st.nextToken());
            }
        }

        bw.write(Integer.toString(memo[m]));
        br.close();
        bw.close();
    }
}
