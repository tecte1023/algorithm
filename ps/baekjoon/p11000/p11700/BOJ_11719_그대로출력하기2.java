/*
 * 문제: 백준 11719번 - 그대로 출력하기 2 (https://www.acmicpc.net/problem/11719)
 *
 * 시간 복잡도: O(l)
 *  l: 입력된 줄의 개수
 */

package baekjoon.p11000.p11700;

import java.io.*;

public class BOJ_11719_그대로출력하기2 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String input;

        while ((input = br.readLine()) != null) {
            sb.append(input).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
