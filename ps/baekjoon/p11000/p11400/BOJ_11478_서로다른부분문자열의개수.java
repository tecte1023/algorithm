/*
 * 문제: 백준 11478번 - 서로 다른 부분 문자열의 개수 (https://www.acmicpc.net/problem/11478)
 *
 * 시간 복잡도: O(n³)
 *  n: 문자열의 길이
 */

package baekjoon.p11000.p11400;

import java.io.*;
import java.util.*;

public class BOJ_11478_서로다른부분문자열의개수 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        Set<String> set = new HashSet<>();

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j + i <= s.length(); j++) {
                set.add(s.substring(j, j + i));
            }
        }

        bw.write(Integer.toString(set.size()));
        br.close();
        bw.close();
    }
}
