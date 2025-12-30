/*
 * 문제: 백준 9063번 - 대지 (https://www.acmicpc.net/problem/9063)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p09000.p09000;

import java.io.*;
import java.util.*;

public class BOJ_9063_대지 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }

        bw.write(Integer.toString((maxX - minX) * (maxY - minY)));
        br.close();
        bw.close();
    }
}
