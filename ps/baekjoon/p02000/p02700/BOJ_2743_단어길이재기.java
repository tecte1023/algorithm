/*
 * 문제: 백준 2743번 - 단어 길이 재기 (https://www.acmicpc.net/problem/2743)
 *
 * 시간 복잡도: O(n)
 *  n: 단어의 길이
 */

package baekjoon.p02000.p02700;

import java.io.*;

public class BOJ_2743_단어길이재기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString(br.readLine().length()));
        br.close();
        bw.close();
    }
}
