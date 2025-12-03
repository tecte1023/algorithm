/*
 * 문제: 백준 2217번 - 로프 (https://www.acmicpc.net/problem/2217)
 * 문제 풀이
 *  로프의 중량 제한을 오름차순으로 정렬함.
 *  특정 로프를 선택했을 때, 그보다 중량 제한이 크거나 같은 로프들을 모두 포함해야 최대 중량을 들 수 있음.
 *  각 로프를 사용하는 로프 중 가장 약한 로프로 가정할 때의 최대 중량 [해당 로프 중량 * (전체 개수 - 현재 인덱스)]을 계산하여 최댓값을 갱신.
 *
 * 시간 복잡도: O(n log n)
 */

package baekjoon.p02000.p02200;

import java.io.*;
import java.util.*;

public class BOJ_2217_로프 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] rope = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope);

        for (int i = 0; i < n; i++) {
            max = Math.max(max, rope[i] * (n - i));
        }

        bw.write(Integer.toString(max));
        br.close();
        bw.close();
    }
}
