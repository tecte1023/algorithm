/*
 * 문제: 백준 2346번 - 풍선 터뜨리기 (https://www.acmicpc.net/problem/2346)
 *
 * 시간 복잡도: O(n²)
 */

package baekjoon.p02000.p02300;

import java.io.*;
import java.util.*;

public class BOJ_2346_풍선터뜨리기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Balloon> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.addLast(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        Balloon balloon = deque.removeFirst();
        StringBuilder sb = new StringBuilder(balloon.idx + " ");

        while (!deque.isEmpty()) {
            if (balloon.num > 0) {
                for (int i = 1; i < balloon.num; i++) {
                    deque.addLast(deque.removeFirst());
                }
            } else {
                for (int i = balloon.num; i < 0; i++) {
                    deque.addFirst(deque.removeLast());
                }
            }

            balloon = deque.removeFirst();
            sb.append(balloon.idx).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static class Balloon {
        int idx, num;

        public Balloon(int idx, int num) {
            this.idx = idx;
            this.num = num;
        }
    }
}
