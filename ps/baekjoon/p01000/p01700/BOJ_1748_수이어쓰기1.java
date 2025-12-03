/*
 * 문제: 백준 1748번 - 수 이어 쓰기 1 (https://www.acmicpc.net/problem/1748)
 * 문제 풀이
 * 각 자릿수 위치(1의 자리, 10의 자리...)별로 숫자가 등장하는 횟수를 누적하는 세로로 세기 방식을 사용함.
 * k번째 자릿수를 가진 수의 개수는 (N - 10^k + 1)개임.
 * 이를 N의 자릿수(d)만큼 합산하면 Sum = d * (N + 1) - Sum(10^k)
 * 등비수열의 합 공식을 적용하여 최종 공식 d * (N + 1) - (10^d - 1) / 9를 도출함.
 *
 * 시간 복잡도: O(log₁₀ n)
 */

package ps.baekjoon.p01000.p01700;

import java.io.*;

public class BOJ_1748_수이어쓰기1 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int d = 0;

        for (int i = 1; n / i != 0; i *= 10) {
            d++;
        }

        bw.write(Integer.toString(d * (n + 1) - (int) (Math.pow(10, d) - 1) / 9));
        br.close();
        bw.close();
    }
}
