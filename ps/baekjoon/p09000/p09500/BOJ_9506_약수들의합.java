/*
 * 문제: 백준 9506번 - 약수들의 합 (https://www.acmicpc.net/problem/9506)
 *
 * 시간 복잡도: O(t * n)
 *  t: 테스트 케이스의 개수
 */

package baekjoon.p09000.p09500;

import java.io.*;
import java.util.*;

public class BOJ_9506_약수들의합 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n;

        while ((n = Integer.parseInt(br.readLine())) != -1) {
            List<Integer> factors = new ArrayList<>();
            int sum = 1;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    factors.add(i);
                    sum += i;
                }
            }

            sb.append(n);

            if (sum == n) {
                sb.append(" = 1");
                factors.forEach(factor -> sb.append(" + ").append(factor));
            } else {
                sb.append(" is NOT perfect.");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
