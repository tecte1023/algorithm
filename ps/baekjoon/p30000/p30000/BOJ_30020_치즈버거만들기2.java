/*
 * 문제: 백준 30020번 - 치즈버거 만들기 2 (https://www.acmicpc.net/problem/30020)
 *
 * 시간 복잡도: O(a)
 */

package baekjoon.p30000.p30000;

import java.io.*;
import java.util.*;

public class BOJ_30020_치즈버거만들기2 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        if (a <= b) {
            sb.append("NO");
        } else {
            int d = a - b;

            if (d > b) {
                sb.append("NO");
            } else {
                sb.append("YES\n").append(d).append("\n");

                for (int i = 1; i < d; i++) {
                    sb.append("aba\n");
                }

                for (int i = b - d; i >= 0; i--) {
                    sb.append("ab");
                }

                sb.append('a');
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
