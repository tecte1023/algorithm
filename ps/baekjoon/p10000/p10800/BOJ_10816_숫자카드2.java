/*
 * 문제: 백준 10816번 - 숫자 카드 2 (https://www.acmicpc.net/problem/10816)
 *
 * 시간 복잡도: O(n + m)
 */

package baekjoon.p10000.p10800;

import java.io.*;
import java.util.*;

public class BOJ_10816_숫자카드2 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> cards = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());

            cards.put(card, cards.getOrDefault(card, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            sb.append(cards.getOrDefault(Integer.parseInt(st.nextToken()), 0)).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
