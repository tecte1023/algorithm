/*
 * 문제: 백준 30993번 - 자동차 주차 (https://www.acmicpc.net/problem/30993)
 *
 * 시간 복잡도: O(n)
 *  n: 자동차의 총 개수
 */

package baekjoon.p30000.p30900;

import java.io.*;
import java.util.*;

public class BOJ_30993_자동차주차 {
    // public class Main {
    private static long factorial(int num) {
        long ret = 1;

        for (int i = 2; i <= num; i++) {
            ret *= i;
        }

        return ret;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.write(Long.toString(factorial(n) / (factorial(a) * factorial(b) * factorial(c))));
        br.close();
        bw.close();
    }
}
