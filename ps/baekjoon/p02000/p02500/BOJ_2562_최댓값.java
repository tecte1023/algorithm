/*
 * 문제: 백준 2562번 - 최댓값 (https://www.acmicpc.net/problem/2562)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p02000.p02500;

import java.io.*;

public class BOJ_2562_최댓값 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int idx = 0;

        for (int i = 1; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());

            if (max < num) {
                max = num;
                idx = i;
            }
        }

        bw.write(max + "\n" + idx);
        br.close();
        bw.close();
    }
}
