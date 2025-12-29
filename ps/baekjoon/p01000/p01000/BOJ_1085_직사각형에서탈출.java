/*
 * 문제: 백준 1085번 - 직사각형에서 탈출 (https://www.acmicpc.net/problem/1085)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p01000.p01000;

import java.io.*;
import java.util.*;

public class BOJ_1085_직사각형에서탈출 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        bw.write(Integer.toString(Math.min(Math.min(x, w - x), Math.min(y, h - y))));
        br.close();
        bw.close();
    }
}
