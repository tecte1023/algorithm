/*
 * 문제: 백준 10952번 - A+B - 5 (https://www.acmicpc.net/problem/10952)
 *
 * 시간 복잡도: O(t)
 *  t: 테스트 케이스의 개수
 */

package baekjoon.p10000.p10900;

import java.io.*;
import java.util.*;

public class BOJ_10952_AB5 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0) {
                break;
            }

            sb.append(a + b).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
