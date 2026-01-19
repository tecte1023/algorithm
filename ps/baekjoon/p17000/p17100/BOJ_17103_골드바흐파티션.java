/*
 * 문제: 백준 17103번 - 골드바흐 파티션 (https://www.acmicpc.net/problem/17103)
 * 문제 풀이
 *  에라토스테네스의 체를 사용하여 소수 여부를 미리 전처리함.
 *  중복을 방지하기 위해 2부터 `n / 2`까지만 순회.
 *  첫 번째 수를 a라고 할 때 a가 소수인지 확인하고, 동시에 나머지 수인 `n - a`도 소수인지 확인.
 *  두 수가 모두 소수라면 유효한 파티션이므로 개수 증가.
 *
 * 시간 복잡도: O(M log(log M) + T * n)
 */

package baekjoon.p17000.p17100;

import java.io.*;

public class BOJ_17103_골드바흐파티션 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        boolean[] composite = new boolean[1_000_001];
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= 1000; i++) {
            if (composite[i]) {
                continue;
            }

            for (int j = i + i; j < composite.length; j += i) {
                composite[j] = true;
            }
        }

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;

            for (int i = 2; i <= n / 2; i++) {
                if (!composite[i] && !composite[n - i]) {
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
