/*
 * 문제: 백준 11650번 - 좌표 정렬하기 (https://www.acmicpc.net/problem/11650)
 *
 * 시간 복잡도: O(n log n)
 */

package baekjoon.p11000.p11600;

import java.io.*;
import java.util.*;

public class BOJ_11650_좌표정렬하기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Pos[] points = new Pos[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points[i] = new Pos(x, y);
        }

        Arrays.sort(points, Comparator.comparingInt((Pos a) -> a.x).thenComparingInt(a -> a.y));

        for (int i = 0; i < n; i++) {
            sb.append(points[i].x).append(" ").append(points[i].y).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static class Pos {
        int x, y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
