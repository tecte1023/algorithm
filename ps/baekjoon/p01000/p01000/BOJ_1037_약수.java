/*
 * 문제: 백준 1037번 - 약수 (https://www.acmicpc.net/problem/1037)
 * 문제 풀이
 *  어떤 정수의 약수들은 곱했을 때 원래 수가 되는 대칭적인 쌍을 이룬다는 수학적 성질을 이용.
 *  즉, `작은 약수 * 큰 약수 = 원래 수`가 성립하므로, 주어진 약수들 중 가장 작은 값과 가장 큰 값을 곱하면 원래의 수를 구할 수 있음.
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p01000.p01000;

import java.io.*;
import java.util.*;

public class BOJ_1037_약수 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());

            min = Math.min(min, a);
            max = Math.max(max, a);
        }

        bw.write(Integer.toString(min * max));
        br.close();
        bw.close();
    }
}
