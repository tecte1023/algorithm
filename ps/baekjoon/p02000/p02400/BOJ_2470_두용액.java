/*
 * 문제: 백준 2470번 - 두 용액 (https://www.acmicpc.net/problem/2470)
 * 문제 풀이
 *  두 용액의 합이 0에 가장 가까운 쌍을 찾기 위해 투 포인터 알고리즘을 이용함.
 *  입력받은 용액들의 특성 값을 오름차순으로 정렬.
 *  두 포인터의 합이 0보다 크면 합을 줄이기 위해 오른쪽 포인터를 왼쪽으로 이동시키고
 *  0보다 작으면 합을 키우기 위해 왼쪽 포인터를 오른쪽으로 이동시킴.
 *  매 단계에서 두 용액 합의 절댓값이 기존에 저장된 최솟값보다 작으면 갱신.
 *
 * 시간 복잡도: O(n log n)
 */

package baekjoon.p02000.p02400;

import java.io.*;
import java.util.*;

public class BOJ_2470_두용액 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] solutions = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int l = 0;
        int r = n - 1;
        int a = 0;
        int b = n - 1;

        while (l < r) {
            int ph = solutions[l] + solutions[r];

            if (Math.abs(ph) < Math.abs(solutions[a] + solutions[b])) {
                a = l;
                b = r;
            }

            if (ph > 0) {
                r--;
            } else {
                l++;
            }
        }

        bw.write(solutions[a] + " " + solutions[b]);
        br.close();
        bw.close();
    }
}
