/*
 * 문제: 백준 2869번 - 달팽이는 올라가고 싶다 (https://www.acmicpc.net/problem/2869)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p02000.p02800;

import java.io.*;
import java.util.*;

public class BOJ_2869_달팽이는올라가고싶다 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        bw.write(Integer.toString((v - b - 1) / (a - b) + 1));
        br.close();
        bw.close();
    }
}
