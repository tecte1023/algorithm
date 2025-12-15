/*
 * 문제: 백준 11718번 - 그대로 출력하기 (https://www.acmicpc.net/problem/11718)
 *
 * 시간 복잡도: O(n)
 *  n: 입력되는 전체 문자열의 길이
 */

package baekjoon.p11000.p11700;

import java.io.*;

public class BOJ_11718_그대로출력하기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        StringBuilder sb = new StringBuilder();

        while ((str = br.readLine()) != null) {
            sb.append(str).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
