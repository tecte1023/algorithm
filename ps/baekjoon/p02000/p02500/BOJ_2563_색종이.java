/*
 * 문제: 백준 2563번 - 색종이 (https://www.acmicpc.net/problem/2563)
 *
 * 시간 복잡도: O(s²)
 *  s: 도화지의 한 변의 길이
 */

package baekjoon.p02000.p02500;

import java.io.*;
import java.util.*;

public class BOJ_2563_색종이 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];
        int area = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = true;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    area++;
                }
            }
        }

        bw.write(Integer.toString(area));
        br.close();
        bw.close();
    }
}
