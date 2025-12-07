/*
 * 문제: 백준 1330번 - 두 수 비교하기 (https://www.acmicpc.net/problem/1330)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p01000.p01300;

import java.io.*;
import java.util.*;

public class BOJ_1330_두수비교하기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b) {
            bw.write(">");
        } else if (a < b) {
            bw.write("<");
        } else {
            bw.write("==");
        }

        br.close();
        bw.close();
    }
}
