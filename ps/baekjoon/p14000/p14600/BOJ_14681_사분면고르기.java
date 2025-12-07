/*
 * 문제: 백준 14681번 - 사분면 고르기 (https://www.acmicpc.net/problem/14681)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p14000.p14600;

import java.io.*;

public class BOJ_14681_사분면고르기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x > 0 && y > 0) {
            bw.write("1");
        } else if (x < 0 && y > 0) {
            bw.write("2");
        } else if (x < 0 && y < 0) {
            bw.write("3");
        } else {
            bw.write("4");
        }

        br.close();
        bw.close();
    }
}
