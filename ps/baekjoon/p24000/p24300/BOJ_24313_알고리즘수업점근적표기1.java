/*
 * 문제: 백준 24313번 - 알고리즘 수업 - 점근적 표기 1 (https://www.acmicpc.net/problem/24313)
 * 문제 풀이
 *  주어진 식 f(n) = a₁n + a₀ 가 모든 n ≥ n₀ 에 대하여 f(n) ≤ c × n 을 만족하는지 확인해야 함.
 *  수식으로 정리하면, a₁n + a₀ ≤ c × n 이고 이 부등식을 n에 대해 정리하면 a₀ ≤ (c - a₁)n 이 됨.
 *  위 부등식이 성립하기 위해서는 우변의 n의 계수 c - a₁ 이 음수가 되어서는 안 되고,
 *  n이 가장 작은 값인 n = n₀일 때 부등식이 성립해야 함.
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p24000.p24300;

import java.io.*;
import java.util.*;

public class BOJ_24313_알고리즘수업점근적표기1 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        bw.write((c >= a1 && a1 * n0 + a0 <= c * n0) ? "1" : "0");
        br.close();
        bw.close();
    }
}
