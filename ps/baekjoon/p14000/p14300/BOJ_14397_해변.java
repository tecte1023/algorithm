/*
 * 문제: 백준 14397번 - 해변 (https://www.acmicpc.net/problem/14397)
 *
 * 시간 복잡도: O(n * m)
 */

package baekjoon.p14000.p14300;

import java.io.*;
import java.util.*;

public class BOJ_14397_해변 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String prev = "";
        int len = 0;

        for (int i = 0; i < n; i++) {
            String row = br.readLine();

            for (int j = 0; j < m; j++) {
                if (j + 1 < m && row.charAt(j) != row.charAt(j + 1)) {
                    len++;
                }

                if (i > 0) {
                    if (row.charAt(j) != prev.charAt(j)) {
                        len++;
                    }

                    if (i % 2 == 0) {
                        if (j > 0 && row.charAt(j) != prev.charAt(j - 1)) {
                            len++;
                        }
                    } else {
                        if (j + 1 < m && row.charAt(j) != prev.charAt(j + 1)) {
                            len++;
                        }
                    }
                }
            }

            prev = row;
        }

        bw.write(Integer.toString(len));
        br.close();
        bw.close();
    }
}
