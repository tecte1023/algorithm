/*
 * 문제: 백준 2525번 - 오븐 시계 (https://www.acmicpc.net/problem/2525)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p02000.p02500;

import java.io.*;
import java.util.*;

public class BOJ_2525_오븐시계 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        b += c;

        if (b >= 60) {
            a += b / 60;
            b %= 60;

            if (a >= 24) {
                a %= 24;
            }
        }

        bw.write(a + " " + b);
        br.close();
        bw.close();
    }
}
