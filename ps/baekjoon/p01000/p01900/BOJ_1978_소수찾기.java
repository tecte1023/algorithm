/*
 * 문제: 백준 1978번 - 소수 찾기 (https://www.acmicpc.net/problem/1978)
 *
 * 시간 복잡도: O(n * √m)
 *  m: 수의 최댓값
 */

package baekjoon.p01000.p01900;

import java.io.*;
import java.util.*;

public class BOJ_1978_소수찾기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (isPrime(num)) {
                cnt++;
            }
        }

        bw.write(Integer.toString(cnt));
        br.close();
        bw.close();
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
