/*
 * 문제: 백준 1008번 - A/B (https://www.acmicpc.net/problem/1008)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p01000.p01000;

import java.io.*;
import java.util.*;

public class BOJ_1008_AB {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        bw.write(Double.toString(a / b));
        br.close();
        bw.close();
    }
}
