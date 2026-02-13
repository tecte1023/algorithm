/*
 * 문제: 백준 11401번 - 이항 계수 3 (https://www.acmicpc.net/problem/11401)
 * 문제 풀이
 *  모듈러 연산에서는 나눗셈이 정의되지 않으므로, 분수 형태의 이항 계수를 계산하기 위해 분모를 모듈러 역원으로 변환하여 곱셈으로 처리함.
 *  MOD가 소수라는 점을 활용하여, 페르마의 소정리에 따라 분모의 MOD - 2 제곱을 구함으로써 역원을 도출.
 *  거대한 지수 승수를 효율적으로 계산하기 위해 분할 정복을 이용하여 거듭제곱을 함.
 *
 * 시간 복잡도: O(n + log mod)
 */

package baekjoon.p11000.p11400;

import java.io.*;
import java.util.*;

public class BOJ_11401_이항계수3 {
    // public class Main {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long a = 1;
        long x = 1;

        k = Math.min(k, n - k);

        for (int i = 0; i < k; i++) {
            a = a * (n - i) % MOD;
        }

        for (int i = 2; i <= k; i++) {
            x = x * i % MOD;
        }

        bw.write(Long.toString(a * pow(x, MOD - 2) % MOD));
        br.close();
        bw.close();
    }

    private static long pow(long a, int b) {
        if (b == 0) {
            return 1;
        }

        long h = pow(a, b / 2);
        long ret = h * h % MOD;

        if (b % 2 == 1) {
            ret = ret * a % MOD;
        }

        return ret;
    }
}
