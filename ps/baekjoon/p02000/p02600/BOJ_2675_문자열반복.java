/*
 * 문제: 백준 2675번 - 문자열 반복 (https://www.acmicpc.net/problem/2675)
 *
 * 시간 복잡도: O(t * r * n)
 *  n: 문자열의 길이
 */

package baekjoon.p02000.p02600;

import java.io.*;
import java.util.*;

public class BOJ_2675_문자열반복 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());

            for (char c : st.nextToken().toCharArray()) {
                for (int i = 0; i < r; i++) {
                    sb.append(c);
                }
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
