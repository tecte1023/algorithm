/*
 * 문제: 백준 1300번 - K번째 수 (https://www.acmicpc.net/problem/1300)
 * 문제 풀이
 *  `n * n` 배열을 직접 생성하지 않고, 매개 변수 탐색을 통해 정답을 찾아냄.
 *  특정 값 m보다 작거나 같은 원소의 개수를 세어서, 그 개수가 k개 이상인지를 확인.
 *  배열의 각 행 i는 i의 배수들로 구성되므로, m보다 작거나 같은 수의 개수는 각 행에서 `m / i`로 계산.
 *  단, 각 행의 원소 개수는 n개를 초과할 수 없으므로 `min(m / i, n)`을 모두 합산하여 전체 개수를 구함.
 *  k번째 수는 반드시 k보다 작거나 같다는 수학적 성질을 이용해 탐색 범위를 1부터 k까지로 제한.
 *
 * 시간 복잡도: O(n log k)
 */

package baekjoon.p13000.p13000;

import java.io.*;

public class BOJ_1300_K번째수 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int l = 1;
        int r = k;
        int result = 0;

        while (l <= r) {
            int m = (l + r) / 2;
            long cnt = 0;

            for (int i = Math.min(m, n); i > 0; i--) {
                cnt += Math.min(m / i, n);
            }

            if (cnt < k) {
                l = m + 1;
            } else if (cnt > k) {
                r = m - 1;
                result = m;
            }
        }

        bw.write(Integer.toString(result));
        br.close();
        bw.close();
    }
}
