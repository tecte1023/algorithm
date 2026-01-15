/*
 * 문제: 백준 13241번 - 최소공배수 (https://www.acmicpc.net/problem/13241)
 * 문제 풀이
 *  유클리드 호제법을 사용하여 최대공약수를 구함.
 *  두 수 a, b와 최대공약수 g, 최소공배수 l 사이의 관계식 `a * b = l * g`를 이용.
 *  위 식을 변형하여 `l = (a * b) / g` 공식을 통해 최소공배수를 도출.
 *
 * 시간 복잡도: O(log(min(a, b)))
 */

package baekjoon.p13000.p13200;

import java.io.*;
import java.util.*;

public class BOJ_13241_최소공배수 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        bw.write(Long.toString(a * b / gcd(a, b)));
        br.close();
        bw.close();
    }

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
