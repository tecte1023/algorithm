/*
 * 문제: 백준 2161번 - 카드1 (https://www.acmicpc.net/problem/2161)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p02000.p02100;

import java.io.*;
import java.util.*;

public class BOJ_2161_카드1 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            sb.append(queue.poll()).append(" ");
            queue.offer(queue.poll());
        }

        sb.append(queue.poll());
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
