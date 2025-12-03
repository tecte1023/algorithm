/*
 * 문제: 백준 1004번 - 어린 왕자 (https://www.acmicpc.net/problem/1004)
 * 문제 풀이
 *  행성계의 진입/이탈은 출발점과 도착점 중 하나만 행성계 내부에 포함될 때 발생.
 *  점과 원의 중심 사이의 거리 제곱과 반지름 제곱을 비교하여 내부 포함 여부 판별.
 *  (출발점 포함 여부) XOR (도착점 포함 여부) 연산을 통해 진입/이탈 횟수 계산.
 *
 * 시간 복잡도: O(t * n)
 */

package ps.baekjoon.p01000.p01000;

import java.io.*;
import java.util.*;

public class BOJ_1004_어린왕자 {
    // public class Main {
    private static boolean isInside(int x1, int y1, int x2, int y2, int r) {
        int x = x2 - x1;
        int y = y2 - y1;

        return x * x + y * y < r * r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                if (isInside(x1, y1, x, y, r) ^ isInside(x2, y2, x, y, r)) {
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
