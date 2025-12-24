/*
 * 문제: 백준 2745번 - 진법 변환 (https://www.acmicpc.net/problem/2745)
 *
 * 시간 복잡도: O(l)
 *  l: B진법 수 N의 길이
 */

package baekjoon.p02000.p02700;

import java.io.*;
import java.util.*;

public class BOJ_2745_진법변환 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        bw.write(Integer.toString(Integer.parseInt(n, b)));
        br.close();
        bw.close();
    }
}
