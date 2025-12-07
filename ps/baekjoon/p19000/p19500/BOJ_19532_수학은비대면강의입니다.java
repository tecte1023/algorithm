/*
 * 문제: 백준 19532번 - 수학은 비대면강의입니다 (https://www.acmicpc.net/problem/19532)
 * 문제 풀이
 *  브루트포스를 통해 x와 y의 가능한 모든 범위를 완전 탐색.
 *
 * 시간 복잡도: O(n²)
 *  n: x와 y가 탐색해야 하는 값의 범위의 크기
 */

package baekjoon.p19000.p19500;

import java.io.*;
import java.util.*;

public class BOJ_19532_수학은비대면강의입니다 {
    // public class Main {
    private static int a, b, c, d, e, f;

    private static String a() {
        for (int x = -999; x < 1000; x++) {
            for (int y = -999; y < 1000; y++) {
                if (a * x + b * y == c && d * x + e * y == f) {
                    return x + " " + y;
                }
            }
        }

        return "";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        bw.write(a());
        br.close();
        bw.close();
    }
}
