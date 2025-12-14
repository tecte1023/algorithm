/*
 * 문제: 백준 11654번 - 아스키 코드 (https://www.acmicpc.net/problem/11654)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p11000.p11600;

import java.io.*;

public class BOJ_11654_아스키코드 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString(br.readLine().charAt(0)));
        br.close();
        bw.close();
    }
}
