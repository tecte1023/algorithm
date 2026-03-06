/*
 * 문제: 백준 3155번 - 터널 (https://www.acmicpc.net/problem/3155)
 * 문제 풀이
 *  현재 위치 가 다음 칸의 천장 높이 이상이면 한 칸 낮추고, 바닥 높이 이하이면 한 칸 높이는 방식으로 진행.
 *
 * 시간 복잡도:
 */

package baekjoon.p03000.p03100;

import java.io.*;
import java.util.*;

public class BOJ_3155_터널 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer ceiling = new StringTokenizer(br.readLine());
        StringTokenizer floor = new StringTokenizer(br.readLine());
        int y = 0;
        StringBuilder sb = new StringBuilder();

        ceiling.nextToken();
        floor.nextToken();

        for (int i = 1; i < n; i++) {
            int c = Integer.parseInt(ceiling.nextToken());
            int f = Integer.parseInt(floor.nextToken());

            if (y >= c) {
                y = c - 1;
            }

            if (y <= f) {
                y = f + 1;
            }

            sb.append(y).append(" ");
        }

        sb.append(0);
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
