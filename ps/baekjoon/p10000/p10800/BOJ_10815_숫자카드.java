/*
 * 문제: 백준 10815번 - 숫자 카드 (https://www.acmicpc.net/problem/10815)
 *
 * 시간 복잡도: O(n + m)
 */

package baekjoon.p10000.p10800;

import java.io.*;
import java.util.*;

public class BOJ_10815_숫자카드 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> cards = new HashSet<>();
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            cards.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            sb.append(cards.contains(Integer.parseInt(st.nextToken())) ? 1 : 0).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
