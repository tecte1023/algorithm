/*
 * 문제: 백준 17095번 - Min-Max Subsequence (https://www.acmicpc.net/problem/17095)
 * 문제 풀이
 *  두 번의 선형 탐색을 수행하여 문제를 해결.
 *  첫 번째 순회: 배열 전체에서 전역 최댓값과 최솟값을 찾음. 만약 두 값이 같다면 길이는 1.
 *  두 번째 순회: 배열을 돌며 가장 최근에 등장한 최댓값의 위치와 가장 최근에 등장한 최솟값의 위치를 실시간으로 갱신.
 *  두 위치가 모두 기록된 상태일 때마다 두 인덱스 간의 거리를 계산하여, 두 값을 모두 포함하는 구간 중 가장 짧은 길이를 구함.
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p17000.p17000;

import java.io.*;
import java.util.*;

public class BOJ_17095_MinMaxSubsequence {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        int max = 0;
        int min = Integer.MAX_VALUE;
        int len = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }

        if (max == min) {
            len = 1;
        } else {
            int minPos = -1;
            int maxPos = -1;

            for (int i = 0; i < n; i++) {
                if (a[i] == min) {
                    minPos = i;
                } else if (a[i] == max) {
                    maxPos = i;
                }

                if (minPos != -1 && maxPos != -1) {
                    len = Math.min(len, Math.abs(maxPos - minPos) + 1);
                }
            }
        }

        bw.write(Integer.toString(len));
        br.close();
        bw.close();
    }
}
