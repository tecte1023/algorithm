/*
 * 문제: 백준 1735번 - 분수 합 (https://www.acmicpc.net/problem/1735)
 * 문제 풀이
 *  두 분수를 합치고, 기약분수로 만들기 위해 최대공약수를 구해서 분자와 분모에 각각 나눔.
 *
 * 시간 복잡도: O(log(min(a, b)))
 *  a: 합쳐진 분자
 *  b: 합쳐진 분모
 */

package baekjoon.p01000.p01700;

import java.io.*;
import java.util.*;

public class BOJ_1735_분수합 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        int ra = a1 * b2 + a2 * b1;
        int rb = b1 * b2;
        int gcd = gcd(ra, rb);

        bw.write((ra / gcd) + " " + (rb / gcd));
        br.close();
        bw.close();
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
