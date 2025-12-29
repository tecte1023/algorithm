/*
 * 문제: 백준 2581번 - 소수 (https://www.acmicpc.net/problem/2581)
 *
 * 시간 복잡도: O(n log log n)
 */

package baekjoon.p02000.p02500;

import java.io.*;

public class BOJ_2581_소수 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        boolean[] visited = new boolean[n + 1];
        int sum = 0;
        int min = 0;

        for (int i = 2; i <= n; i++) {
            if (visited[i]) {
                continue;
            }

            for (int j = i; j <= n; j += i) {
                visited[j] = true;
            }

            if (i >= m) {
                sum += i;

                if (min == 0) {
                    min = i;
                }
            }
        }

        bw.write(sum == 0 ? "-1" : sum + "\n" + min);
        br.close();
        bw.close();
    }
}
