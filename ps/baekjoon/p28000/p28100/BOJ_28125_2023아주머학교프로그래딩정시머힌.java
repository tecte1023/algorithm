/*
 * 문제: 백준 28125번 - 2023 아주머학교 프로그래딩 정시머힌 (https://www.acmicpc.net/problem/28125)
 *
 * 시간 복잡도: O(l)
 *  l: 입력된 문자열의 길이
 */

package ps.baekjoon.p28000.p28100;

import java.io.*;
import java.util.*;

public class BOJ_28125_2023아주머학교프로그래딩정시머힌 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Character, Character> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        map.put('@', 'a');
        map.put('[', 'c');
        map.put('!', 'i');
        map.put(';', 'j');
        map.put('^', 'n');
        map.put('0', 'o');
        map.put('7', 't');

        while (n-- > 0) {
            String s = br.readLine();
            StringBuilder word = new StringBuilder();
            int bs = 0;
            int cnt = 0;

            for (char c : s.toCharArray()) {
                if (c == '\\') {
                    bs++;
                } else if (c == '\'') {
                    word.append(bs == 1 ? 'v' : 'w');
                    bs = 0;
                    cnt++;
                } else if (map.containsKey(c)) {
                    word.append(map.get(c));
                    cnt++;
                } else {
                    word.append(c);
                }
            }

            sb.append(word.length() / 2.0 <= cnt ? "I don't understand" : word).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
