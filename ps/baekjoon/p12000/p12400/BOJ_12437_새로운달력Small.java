/*
 * 문제: 백준 12437번 - 새로운 달력 (Small) (https://www.acmicpc.net/problem/12437)
 *
 * 시간 복잡도: O(t * m)
 *  m: 각 케이스의 총 월 개수
 */

package ps.baekjoon.p12000.p12400;

import java.io.*;
import java.util.*;

public class BOJ_12437_새로운달력Small {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int y = 0;
            int mod = 0;

            for (int j = 0; j < m; j++) {
                y += d / w;
                mod += d % w;
                y += mod / w;
                mod %= w;

                if (mod > 0) {
                    y++;
                }
            }

            sb.append("Case #").append(i).append(": ").append(y).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
