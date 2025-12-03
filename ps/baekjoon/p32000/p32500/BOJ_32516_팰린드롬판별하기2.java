/*
 * 문제: 백준 32516번 - 팰린드롬 판별하기 2 (https://www.acmicpc.net/problem/32516)
 *
 * 시간 복잡도: O(n)
 */

package ps.baekjoon.p32000.p32500;

import java.io.*;

public class BOJ_32516_팰린드롬판별하기2 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        String s = br.readLine();
        int cnt = 0;

        for (int i = 0; i < s.length() / 2; i++) {
            char l = s.charAt(i);
            char r = s.charAt(s.length() - 1 - i);

            if (l == '?' && r == '?') {
                cnt += 26;
            } else if (l == '?' || r == '?') {
                cnt++;
            } else if (l != r) {
                cnt = 0;
                break;
            }
        }

        bw.write(Integer.toString(cnt));
        br.close();
        bw.close();
    }
}
