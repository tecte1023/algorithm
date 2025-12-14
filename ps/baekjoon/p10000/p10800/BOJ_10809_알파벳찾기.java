/*
 * 문제: 백준 10809번 - 알파벳 찾기 (https://www.acmicpc.net/problem/10809)
 *
 * 시간 복잡도: O(n)
 *  n: 단어의 길이
 */

package baekjoon.p10000.p10800;

import java.io.*;
import java.util.*;

public class BOJ_10809_알파벳찾기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int[] alphabet = new int[26];
        StringBuilder sb = new StringBuilder();

        Arrays.fill(alphabet, -1);

        for (int i = s.length() - 1; i >= 0; i--) {
            alphabet[s.charAt(i) - 'a'] = i;
        }

        for (int a : alphabet) {
            sb.append(a).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
