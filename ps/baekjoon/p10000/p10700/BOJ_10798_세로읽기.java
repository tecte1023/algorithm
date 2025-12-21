/*
 * 문제: 백준 10798번 - 세로읽기 (https://www.acmicpc.net/problem/10798)
 *
 * 시간 복잡도: O(n * m)
 *  n: 단어의 개수
 *  m: 단어의 길이
 */

package baekjoon.p10000.p10700;

import java.io.*;

public class BOJ_10798_세로읽기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] words = new char[5][15];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            String word = br.readLine();

            for (int j = 0; j < word.length(); j++) {
                words[i][j] = word.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (words[j][i] != 0) {
                    sb.append(words[j][i]);
                }
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
