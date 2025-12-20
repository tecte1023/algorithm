/*
 * 문제: 백준 2566번 - 최댓값 (https://www.acmicpc.net/problem/2566)
 *
 * 시간 복잡도: O(n * m)
 *  n: 격자판의 세로 길이
 *  m: 격자판의 가로 길이
 */

package baekjoon.p02000.p02500;

import java.io.*;
import java.util.*;

public class BOJ_2566_최댓값 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= 9; j++) {
                int n = Integer.parseInt(st.nextToken());

                if (n >= max) {
                    max = n;
                    x = i;
                    y = j;
                }
            }
        }

        bw.write(max + "\n" + x + " " + y);
        br.close();
        bw.close();
    }
}
