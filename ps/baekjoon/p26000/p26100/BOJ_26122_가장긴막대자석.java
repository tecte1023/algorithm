/*
 * 문제: 백준 26122번 - 가장 긴 막대 자석 (https://www.acmicpc.net/problem/26122)
 *
 * 시간 복잡도: O(k)
 */

package ps.baekjoon.p26000.p26100;

import java.io.*;

public class BOJ_26122_가장긴막대자석 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char prev = 0;
        int nc = 0;
        int sc = 0;
        int len = 0;

        for (int i = 0; i < k; i++) {
            char c = str.charAt(i);

            if (prev != c) {
                len = Math.max(len, Math.min(nc, sc) * 2);

                if (c == 'N') {
                    nc = 0;
                } else {
                    sc = 0;
                }
            }

            if (c == 'N') {
                nc++;
            } else {
                sc++;
            }

            prev = c;
        }

        len = Math.max(len, Math.min(nc, sc) * 2);
        bw.write(Integer.toString(len));
        br.close();
        bw.close();
    }
}
