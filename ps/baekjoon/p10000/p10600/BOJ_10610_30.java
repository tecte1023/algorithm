/*
 * 문제: 백준 10610번 - 30 (https://www.acmicpc.net/problem/10610)
 * 문제 풀이
 *  30의 배수가 되기 위한 조건(일의 자리가 0이며, 각 자릿수의 합이 3의 배수)을 활용한 그리디 알고리즘 적용.
 *
 * 시간 복잡도: O(n)
 *  n: 입력된 숫자의 자릿수
 */

package baekjoon.p10000.p10600;

import java.io.*;

public class BOJ_10610_30 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] digitCounts = new int[10];
        int sum = 0;
        boolean hasZero = false;

        for (char c : br.readLine().toCharArray()) {
            int digit = c - '0';

            digitCounts[digit]++;
            sum += digit;

            if (digit == 0) {
                hasZero = true;
            }
        }

        if (!hasZero || sum % 3 != 0) {
            System.out.println("-1");

            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int digit = 9; digit >= 0; digit--) {
            while (digitCounts[digit] > 0) {
                sb.append(digit);
                digitCounts[digit]--;
            }
        }

        System.out.print(sb);
    }
}
