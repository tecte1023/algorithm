/*
 * 문제: 백준 2884번 - 알람 시계 (https://www.acmicpc.net/problem/2884)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p02000.p02800;

import java.io.*;
import java.util.*;

public class BOJ_2884_알람시계 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m < 45) {
            if (h == 0) {
                h = 24;
            }

            h--;
            m += 60;
        }

        bw.write(h + " " + (m - 45));
        br.close();
        bw.close();
    }
}
