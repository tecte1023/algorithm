/*
 * 문제: 백준 2908번 - 상수 (https://www.acmicpc.net/problem/2908)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p02000.p02900;

import java.io.*;
import java.util.*;

public class BOJ_2908_상수 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int na = 0;
        int nb = 0;

        for (int i = 0; i < 3; i++) {
            na = na * 10 + a % 10;
            nb = nb * 10 + b % 10;
            a /= 10;
            b /= 10;
        }

        bw.write(Integer.toString(Math.max(na, nb)));
        br.close();
        bw.close();
    }
}
