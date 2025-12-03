/*
 * 문제: 백준 4539번 - 반올림 (https://www.acmicpc.net/problem/4539)
 *
 * 시간 복잡도: O(n * l)
 *  l: 입력된 수의 자릿수
 */

package baekjoon.p04000.p04500;

import java.io.*;

public class BOJ_4539_반올림 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char[] x = br.readLine().toCharArray();
            int ceiling = 0;
            StringBuilder sb = new StringBuilder();

            for (int j = x.length - 1; j > 0; j--) {
                ceiling = x[j] - '0' + ceiling < 5 ? 0 : 1;
                sb.append(0);
            }

            result.append(x[0] - '0' + ceiling).append(sb).append("\n");
        }

        bw.write(result.toString());
        br.close();
        bw.close();
    }
}
