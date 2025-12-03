/*
 * 문제: 백준 23630번 - 가장 긴 부분 수열 구하기 (https://www.acmicpc.net/problem/23630)
 * 문제 풀이
 *  부분 수열의 모든 원소를 AND 연산했을 때 결과가 0이 아니려면, 선택된 모든 수가 최소한 하나의 공통된 비트를 공유해야 함.
 *  따라서 입력된 모든 수에 대해 각 비트 자릿수별로 1이 등장하는 횟수를 카운트함.
 *  특정 자릿수에서 1이 가장 많이 등장했다면, 그 자릿수를 1로 가진 수들을 모두 모았을 때가 조건을 만족하는 가장 긴 부분 수열이 됨.
 *
 * 시간 복잡도: O(n)
 */

package ps.baekjoon.p23000.p23600;

import java.io.*;
import java.util.*;

public class BOJ_23630_가장긴부분수열구하기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] bitCnt = new int[20];

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 20; j++) {
                if ((a & 1) != 0) {
                    bitCnt[j]++;
                }

                a >>= 1;
            }
        }

        bw.write(Integer.toString(Arrays.stream(bitCnt).max().orElse(1)));
        br.close();
        bw.close();
    }
}
