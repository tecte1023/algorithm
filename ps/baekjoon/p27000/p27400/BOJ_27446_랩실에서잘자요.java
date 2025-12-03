/*
 * 문제: 백준 27446번 - 랩실에서 잘 자요 (https://www.acmicpc.net/problem/27446)
 * 문제 풀이
 *  잃어버린 페이지들을 리스트로 추출한 뒤, DP를 사용하여 최소 비용을 계산.
 *  i번째 페이지를 포함하는 구간을 정할 때, 처음부터 i까지 한 번에 인쇄하는 경우와,
 *  이전의 최적해를 활용하여 j+1번째부터 i번째까지를 새로운 구간으로 인쇄하는 경우를 모두 비교하여 최솟값을 갱신.
 *
 * 시간 복잡도: O(k²)
 *  k: 잃어버린 페이지의 개수
 */

package baekjoon.p27000.p27400;

import java.io.*;
import java.util.*;

public class BOJ_27446_랩실에서잘자요 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[n + 1];
        List<Integer> list = new ArrayList<>();
        String result = "0";

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            visited[Integer.parseInt(st.nextToken())] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                list.add(i);
            }
        }

        if (!list.isEmpty()) {
            int l = list.size();
            int[] memo = new int[l];

            for (int i = 0; i < l; i++) {
                memo[i] = 5 + 2 * (list.get(i) - list.get(0) + 1);

                for (int j = 0; j < i; j++) {
                    memo[i] = Math.min(memo[i], memo[j] + 5 + 2 * (list.get(i) - list.get(j + 1) + 1));
                }
            }

            result = Integer.toString(memo[l - 1]);
        }

        bw.write(result);
        br.close();
        bw.close();
    }
}
