/*
 * 문제: 백준 25344번 - 행성 정렬 (https://www.acmicpc.net/problem/25344)
 * 문제 풀이
 *  모든 행성이 동시에 일직선으로 정렬되는 최초의 시점은 각 행성의 정렬 주기들의 최소공배수.
 *  유클리드 호제법을 사용하여 최대공약수를 구하고, 관계식 [LCM(a, b) = a * b / GCD(a, b)]을 이용하여 두 수의 최소공배수를 구함.
 *  여러 수의 최소공배수는 앞에서부터 두 수씩 묶어서 누적 계산하여 도출.
 *
 * 시간 복잡도: O(n)
 */

package ps.baekjoon.p25000.p25300;

import java.io.*;
import java.util.*;

public class BOJ_25344_행성정렬 {
    // public class Main {
    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long l = t[0];

        for (int i = 1; i < t.length; i++) {
            l = lcm(l, t[i]);
        }

        bw.write(Long.toString(l));
        br.close();
        bw.close();
    }
}
