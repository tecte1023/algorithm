/*
 * 문제: 백준 1014번 - 컨닝 (https://www.acmicpc.net/problem/1014)
 * 문제 풀이
 *  교실의 한 열을 기준으로 가능한 모든 배치 상태를 비트마스크로 나타내어 처리함.
 *  특정 열의 배치 상태가 이전 열의 배치 상태에만 영향을 받는 성질을 이용한 동적 계획법을 적용.
 *  각 열에서 부서진 책상 위치와 배치하려는 학생 위치가 겹치는지 비트 연산으로 확인.
 *  현재 열의 학생이 왼쪽 위, 왼쪽, 왼쪽 아래 방향의 학생과 컨닝 관계에 있는지 비트 시프트 연산으로 확인.
 *  매 열마다 가능한 모든 배치 조합에 대해 누적된 최대 학생 수를 갱신하며, 마지막 열까지 도달했을 때의 최댓값을 도출함.
 *
 * 시간 복잡도: O(c * m * 4ⁿ)
 */

package baekjoon.p01000.p01000;

import java.io.*;
import java.util.*;

public class BOJ_1014_컨닝 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (c-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] broken = new int[m + 1];
            int[][] memo = new int[1 << n][m + 1];
            int max = 0;

            for (int i = 0; i < n; i++) {
                String l = br.readLine();

                for (int j = 0; j < l.length(); j++) {
                    if (l.charAt(j) == 'x') {
                        broken[j + 1] |= (1 << i);
                    }
                }
            }

            for (int i = 1; i <= m; i++) {
                for (int j = 0; j < memo.length; j++) {
                    if ((broken[i] & j) != 0) {
                        continue;
                    }

                    int cnt = Integer.bitCount(j);

                    for (int k = 0; k < memo.length; k++) {
                        if (((k & (j >> 1)) | (k & j) | (k & (j << 1))) == 0) {
                            memo[j][i] = Math.max(memo[j][i], memo[k][i - 1] + cnt);
                        }
                    }
                }
            }

            for (int i = 0; i < memo.length; i++) {
                max = Math.max(max, memo[i][m]);
            }

            sb.append(max).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
