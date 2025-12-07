/*
 * 문제: 백준 10869번 - 사칙연산 (https://www.acmicpc.net/problem/10869)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p10000.p10800;

import java.io.*;
import java.util.*;

public class BOJ_10869_사칙연산 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write((a + b) + "\n" + (a - b) + "\n" + a * b + "\n" + a / b + "\n" + a % b);
        br.close();
        bw.close();
    }
}
