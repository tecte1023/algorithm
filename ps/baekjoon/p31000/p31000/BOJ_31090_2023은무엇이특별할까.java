/*
 * 문제: 백준 31090번 - 2023은 무엇이 특별할까? (https://www.acmicpc.net/problem/31090)
 *
 * 시간 복잡도: O(t)
 */

package baekjoon.p31000.p31000;

import java.io.*;

public class BOJ_31090_2023은무엇이특별할까 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int m = n % 100;

            sb.append((n + 1) % m == 0 ? "Good" : "Bye").append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
