/*
 * 문제: 백준 10988번 - 팰린드롬인지 확인하기 (https://www.acmicpc.net/problem/10988)
 *
 * 시간 복잡도: O(n)
 *  n: 단어의 길이
 */

package baekjoon.p10000.p10900;

import java.io.*;

public class BOJ_10988_팰린드롬인지확인하기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        String result = "1";

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                result = "0";
                break;
            }
        }

        bw.write(result);
        br.close();
        bw.close();
    }
}
