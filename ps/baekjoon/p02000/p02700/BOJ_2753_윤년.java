/*
 * 문제: 백준 2753번 - 윤년 (https://www.acmicpc.net/problem/2753)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p02000.p02700;

import java.io.*;

public class BOJ_2753_윤년 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int y = Integer.parseInt(br.readLine());

        bw.write(((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ? "1" : "0");
        br.close();
        bw.close();
    }
}
