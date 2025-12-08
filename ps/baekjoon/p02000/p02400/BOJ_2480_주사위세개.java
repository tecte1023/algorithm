/*
 * 문제: 백준 2480번 - 주사위 세개 (https://www.acmicpc.net/problem/2480)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p02000.p02400;

import java.io.*;
import java.util.*;

public class BOJ_2480_주사위세개 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d1 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        int d3 = Integer.parseInt(st.nextToken());
        int prize;

        if (d1 == d2 && d2 == d3) {
            prize = 10000 + d1 * 1000;
        } else if (d1 != d2 && d2 != d3 && d1 != d3) {
            prize = Math.max(d1, Math.max(d2, d3)) * 100;
        } else {
            prize = 1000 + (d1 == d2 ? d1 : d3) * 100;
        }

        bw.write(Integer.toString(prize));
        br.close();
        bw.close();
    }
}
