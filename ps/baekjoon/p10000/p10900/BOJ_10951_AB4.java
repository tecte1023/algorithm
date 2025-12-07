/*
 * 문제: 백준 10951번 - A+B - 4 (https://www.acmicpc.net/problem/10951)
 *
 * 시간 복잡도: O(t)
 *  t: 테스트 케이스의 개수
 */

package baekjoon.p10000.p10900;

import java.io.*;
import java.util.*;

public class BOJ_10951_AB4 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a + b).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
