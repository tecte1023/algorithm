/*
 * 문제: 백준 22341번 - 사각형 면적 (https://www.acmicpc.net/problem/22341)
 *
 * 시간 복잡도: O(c)
 */

package baekjoon.p22000.p22300;

import java.io.*;
import java.util.*;

public class BOJ_22341_사각형면적 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int a = n;
        int b = n;

        while (c-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x >= a || y >= b) {
                continue;
            }

            if ((a - x) * b > (b - y) * a) {
                b = y;
            } else {
                a = x;
            }
        }

        bw.write(Integer.toString(a * b));
        br.close();
        bw.close();
    }
}
