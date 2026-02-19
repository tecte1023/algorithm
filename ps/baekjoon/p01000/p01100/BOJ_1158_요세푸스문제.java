/*
 * 문제: 백준 1158번 - 요세푸스 문제 (https://www.acmicpc.net/problem/1158)
 *
 * 시간 복잡도: O(n * k)
 */

package baekjoon.p01000.p01100;

import java.io.*;
import java.util.*;

public class BOJ_1158_요세푸스문제 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        int cnt = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        sb.append("<");

        while (true) {
            if (++cnt == k) {
                sb.append(queue.poll());
                cnt = 0;

                if (queue.isEmpty()) {
                    break;
                }

                sb.append(", ");
            } else {
                queue.offer(queue.poll());
            }
        }

        sb.append(">");
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
