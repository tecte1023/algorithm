/*
 * 문제: 백준 25314번 - 코딩은 체육과목 입니다 (https://www.acmicpc.net/problem/25314)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p25000.p25300;

import java.io.*;

public class BOJ_25314_코딩은체육과목입니다 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()) / 4;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("long ");
        }

        bw.write(sb.append("int").toString());
        br.close();
        bw.close();
    }
}
