/*
 * 문제: 백준 34073번 - DORO (https://www.acmicpc.net/problem/34073)
 *
 * 시간 복잡도: O(n)
 *  n: 단어의 개수
 */

package baekjoon.p34000.p34000;

import java.io.*;
import java.util.*;

public class BOJ_34073_DORO {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            sb.append(st.nextToken()).append("DORO ");
        }

        System.out.print(sb);
    }
}
