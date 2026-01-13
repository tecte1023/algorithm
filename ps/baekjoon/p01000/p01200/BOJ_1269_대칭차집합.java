/*
 * 문제: 백준 1269번 - 대칭 차집합 (https://www.acmicpc.net/problem/1269)
 *
 * 시간 복잡도: O(n + m)
 *  n: 집합 A의 크기
 *  m: 집합 B의 크기
 */

package baekjoon.p01000.p01200;

import java.io.*;
import java.util.*;

public class BOJ_1269_대칭차집합 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();
        int c = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < b; i++) {
            if (set.contains(Integer.parseInt(st.nextToken()))) {
                c++;
            }
        }

        bw.write(Integer.toString(a + b - c * 2));
        br.close();
        bw.close();
    }
}
