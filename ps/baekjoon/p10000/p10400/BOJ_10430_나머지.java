/*
 * 문제: 백준 10430번 - 나머지 (https://www.acmicpc.net/problem/10430)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p10000.p10400;

import java.io.*;
import java.util.*;

public class BOJ_10430_나머지 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.write((a + b) % c + "\n" + ((a % c) + (b % c)) % c + "\n" + (a * b) % c + "\n" + ((a % c) * (b % c)) % c);
        br.close();
        bw.close();
    }
}
