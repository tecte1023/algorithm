/*
 * 문제: 백준 24511번 - queuestack (https://www.acmicpc.net/problem/24511)
 * 문제 풀이
 *  스택은 들어온 값이 바로 나가므로 결과에 영향을 주지 않아 무시.
 *  결국 큐인 자료구조들의 값만 연결된 하나의 큰 큐와 같음.
 *
 * 시간 복잡도: O(n + m)
 */

package baekjoon.p24000.p24500;

import java.io.*;
import java.util.*;

public class BOJ_24511_queuestack {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer a = new StringTokenizer(br.readLine());
        StringTokenizer b = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer c = new StringTokenizer(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(b.nextToken());

            if (a.nextToken().equals("0")) {
                deque.addLast(x);
            }
        }

        for (int i = 0; i < m; i++) {
            deque.addFirst(Integer.parseInt(c.nextToken()));
            sb.append(deque.removeLast()).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
