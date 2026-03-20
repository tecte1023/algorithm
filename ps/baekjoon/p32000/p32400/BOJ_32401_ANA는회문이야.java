/*
 * 문제: 백준 32401번 - ANA는 회문이야 (https://www.acmicpc.net/problem/32401)
 *
 * 시간 복잡도: O(n)
 *  n: 문자열의 길이
 */

package baekjoon.p32000.p32400;

import java.io.*;

public class BOJ_32401_ANA는회문이야 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        boolean hasA = false;
        int nCount = 0;
        int anaCount = 0;

        for (char c : br.readLine().toCharArray()) {
            if (c == 'A') {
                if (hasA && nCount == 1) {
                    anaCount++;
                }

                hasA = true;
                nCount = 0;
            } else if (c == 'N') {
                nCount++;
            }
        }

        System.out.print(anaCount);
    }
}
