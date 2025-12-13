/*
 * 문제: 백준 5597번 - 과제 안 내신 분..? (https://www.acmicpc.net/problem/5597)
 *
 * 시간 복잡도: O(m)
 *  m: 학생 수
 */

package baekjoon.p05000.p05500;

import java.io.*;

public class BOJ_5597_과제안내신분 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] submit = new boolean[31];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 28; i++) {
            submit[Integer.parseInt(br.readLine())] = true;
        }

        for (int i = 1; i < submit.length; i++) {
            if (!submit[i]) {
                sb.append(i).append("\n");
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
