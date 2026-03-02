/*
 * 문제: 백준 1450번 - 냅색문제 (https://www.acmicpc.net/problem/1450)
 * 문제 풀이
 *  물건을 절반으로 나누어 각각의 부분집합 합을 구하는 Meet-in-the-middle을 사용함.
 *  나누어진 두 그룹에서 가능한 모든 무게의 합을 구함.
 *  한쪽 그룹을 오름차순으로 정렬한 뒤, 다른 쪽 그룹의 각 원소에 대해 무게 제한을 넘지 않는 짝의 개수를 이분 탐색으로 찾음.
 *
 * 시간 복잡도: O(2^(n/2) * n)
 */

package baekjoon.p01000.p01400;

import java.io.*;
import java.util.*;

public class BOJ_1450_냅색문제 {
    // public class Main {
    private static int c;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<Integer> a = new ArrayList<>(n / 2);
        List<Integer> b = new ArrayList<>(n / 2 + 1);
        int cnt = 0;

        c = Integer.parseInt(st.nextToken());
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        backtracking(0, 0, n / 2, a);
        backtracking(n / 2, 0, n, b);
        b.sort(Comparator.naturalOrder());

        for (int v : a) {
            cnt += upperBound(b, c - v);
        }

        bw.write(Integer.toString(cnt));
        br.close();
        bw.close();
    }

    private static void backtracking(int depth, int sum, int limit, List<Integer> list) {
        if (sum > c) {
            return;
        } else if (depth == limit) {
            list.add(sum);

            return;
        }

        backtracking(depth + 1, sum + arr[depth], limit, list);
        backtracking(depth + 1, sum, limit, list);
    }

    private static int upperBound(List<Integer> list, int t) {
        int l = 0;
        int r = list.size();

        while (l < r) {
            int m = (l + r) / 2;

            if (t < list.get(m)) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return l;
    }
}
