/*
 * 문제: 백준 1316번 - 그룹 단어 체커 (https://www.acmicpc.net/problem/1316)
 * 문제 풀이
 *  HashSet을 사용하여 문자의 등장 이력을 관리하고 중복 발생 여부를 검사.
 *  문자가 달라지는 순간에만 과거의 등장 여부를 확인하여 그룹 단어 여부를 판별.
 *
 * 시간 복잡도: O(n * l)
 *  l: 단어의 길이
 */

package baekjoon.p01000.p01300;

import java.io.*;
import java.util.*;

public class BOJ_1316_그룹단어체커 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (n-- > 0) {
            String word = br.readLine();
            char prev = word.charAt(0);
            Set<Character> set = new HashSet<>();
            boolean flag = true;

            set.add(prev);

            for (int i = 1; i < word.length(); i++) {
                char c = word.charAt(i);

                if (c == prev) {
                    continue;
                } else if (set.contains(c)) {
                    flag = false;
                    break;
                }

                prev = c;
                set.add(c);
            }

            if (flag) {
                cnt++;
            }
        }

        bw.write(Integer.toString(cnt));
        br.close();
        bw.close();
    }
}
