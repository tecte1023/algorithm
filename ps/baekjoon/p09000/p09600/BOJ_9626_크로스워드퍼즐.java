/*
 * 문제: 백준 9626번 - 크로스워드 퍼즐 (https://www.acmicpc.net/problem/9626)
 *
 * 시간 복잡도: O(h * w)
 *  h: 최종적으로 완성된 전체 보드의 세로 길이
 *  w: 최종적으로 완성된 전체 보드의 가로 길이
 */

package baekjoon.p09000.p09600;

import java.io.*;
import java.util.*;

public class BOJ_9626_크로스워드퍼즐 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int x = u + m + d;
        int y = l + n + r;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i < u || i >= u + m || j < l || j >= l + n) {
                    sb.append((i + j) % 2 == 0 ? '#' : '.');
                } else {
                    sb.append(br.readLine());
                    j += n - 1;
                }
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
