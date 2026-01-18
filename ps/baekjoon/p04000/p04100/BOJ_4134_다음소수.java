/*
 * 문제: 백준 4134번 - 다음 소수 (https://www.acmicpc.net/problem/4134)
 * 문제 풀이
 *  n부터 1씩 증가하며 소수를 찾음.
 *  소수 판별을 위해 해당 수의 제곱근까지 나누어 떨어지는지 수가 있는지 확인.
 *
 * 시간 복잡도: O(t * √n)
 *  t: 테스트 케이스의 개수
 */

package baekjoon.p04000.p04100;

import java.io.*;

public class BOJ_4134_다음소수 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());

            if (n <= 2) {
                sb.append("2\n");
                continue;
            }

            while (!isPrime(n)) {
                n++;
            }

            sb.append(n).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
