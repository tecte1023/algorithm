/*
 * 문제: 백준 11720번 - 숫자의 합 (https://www.acmicpc.net/problem/11720)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p11000.p11700;

import java.io.*;

public class BOJ_11720_숫자의합 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;

        br.readLine();

        for (char n : br.readLine().toCharArray()) {
            sum += n - '0';
        }

        bw.write(Integer.toString(sum));
        br.close();
        bw.close();
    }
}
