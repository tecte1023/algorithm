/*
 * 문제: 백준 5086번 - 배수와 약수 (https://www.acmicpc.net/problem/5086)
 *
 * 시간 복잡도: O(t)
 *  t: 테스트 케이스 수
 */

package baekjoon.p05000.p05000;

import java.io.*;
import java.util.*;

public class BOJ_5086_배수와약수 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a + b == 0) {
                break;
            }

            if (a > b && a % b == 0) {
                sb.append("multiple\n");
            } else if (a < b && b % a == 0) {
                sb.append("factor\n");
            } else {
                sb.append("neither\n");
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
