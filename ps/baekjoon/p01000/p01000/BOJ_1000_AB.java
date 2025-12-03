/*
 * 문제: 백준 1000번 - A+B (https://www.acmicpc.net/problem/1000)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p01000.p01000;

import java.io.*;
import java.util.*;

public class BOJ_1000_AB {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(Integer.toString(a + b));
        br.close();
        bw.close();
    }
}
