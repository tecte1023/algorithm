/*
 * 문제: 백준 34217번 - 찾아오시는 길 (https://www.acmicpc.net/problem/34217)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p34000.p34200;

import java.io.*;
import java.util.*;

public class BOJ_34217_찾아오시는길 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        String result;

        if (a + c < b + d) {
            result = "Hanyang Univ.";
        } else if (a + c > b + d) {
            result = "Yongdap";
        } else {
            result = "Either";
        }

        System.out.print(result);
    }
}
