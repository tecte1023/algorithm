/*
 * 문제: 백준 17285번 - XORChic (https://www.acmicpc.net/problem/17285)
 *
 * 시간 복잡도: O(l)
 *  l: 입력된 문자열의 길이
 */

package baekjoon.p17000.p17200;

import java.io.*;

public class BOJ_17285_XORChic {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String t = br.readLine();
        int key = t.charAt(0) ^ 'C';
        StringBuilder sb = new StringBuilder();

        for (char c : t.toCharArray()) {
            sb.append((char) (c ^ key));
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
