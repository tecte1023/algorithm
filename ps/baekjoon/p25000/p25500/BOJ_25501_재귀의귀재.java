/*
 * 문제: 백준 25501번 - 재귀의 귀재 (https://www.acmicpc.net/problem/25501)
 *
 * 시간 복잡도: O(t * l)
 *  l: 문자열 s의 길이
 */

package baekjoon.p25000.p25500;

import java.io.*;

public class BOJ_25501_재귀의귀재 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine();
            int isPalindrome = 1;
            int cnt = 1;

            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    isPalindrome = 0;
                    break;
                }

                cnt++;
            }

            sb.append(isPalindrome).append(" ").append(cnt).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
