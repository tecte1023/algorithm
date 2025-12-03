/*
 * 문제: 백준 28432번 - 끝말잇기 (https://www.acmicpc.net/problem/28432)
 *
 * 시간 복잡도: O(n + m)
 */

package baekjoon.p28000.p28400;

import java.io.*;
import java.util.*;

public class BOJ_28432_끝말잇기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n + 1];
        Set<String> set = new HashSet<>();
        int pos = 0;

        for (int i = 1; i <= n; i++) {
            words[i] = br.readLine();
            set.add(words[i]);

            if (words[i].charAt(0) == '?') {
                pos = i;
            }
        }

        int m = Integer.parseInt(br.readLine());
        String ret = "";

        if (n == 1) {
            ret = br.readLine();
        } else {
            for (int i = 0; i < m; i++) {
                String a = br.readLine();

                if (set.contains(a)) {
                    continue;
                }

                if (pos == 1) {
                    if (a.charAt(a.length() - 1) == words[pos + 1].charAt(0)) {
                        ret = a;
                    }
                } else if (pos == n) {
                    if (a.charAt(0) == words[pos - 1].charAt(words[pos - 1].length() - 1)) {
                        ret = a;
                    }
                } else if (a.charAt(0) == words[pos - 1].charAt(words[pos - 1].length() - 1) && a.charAt(a.length() - 1) == words[pos + 1].charAt(0)) {
                    ret = a;
                }
            }
        }

        bw.write(ret);
        br.close();
        bw.close();
    }
}
