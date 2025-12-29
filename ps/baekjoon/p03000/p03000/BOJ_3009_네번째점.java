/*
 * 문제: 백준 3009번 - 네 번째 점 (https://www.acmicpc.net/problem/3009)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p03000.p03000;

import java.io.*;
import java.util.*;

public class BOJ_3009_네번째점 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = x1 == x2 ? x3 : (x1 == x3 ? x2 : x1);
        int y4 = y1 == y2 ? y3 : (y1 == y3 ? y2 : y1);

        bw.write(x4 + " " + y4);
        br.close();
        bw.close();
    }
}
