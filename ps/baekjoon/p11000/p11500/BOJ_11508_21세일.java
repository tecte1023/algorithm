/*
 * 문제: 백준 11508번 - 2+1 세일 (https://www.acmicpc.net/problem/11508)
 * 문제 풀이
 *  유제품 n개를 구매할 때 최소 비용을 구하기 위해 그리디 알고리즘을 사용.
 *  비싼 물건끼리 묶어서 그중 상대적으로 가격이 높은 물건을 무료로 처리해야 함.
 *  우선순위 큐를 사용하여 가격이 비싼 순서대로 꺼내며,
 *  3개씩 묶었을 때 1, 2번째 물건 값은 지불하고 3번째 물건 값은 지불하지 않는 방식으로 계산.
 *
 * 시간 복잡도: O(n log n)
 */

package ps.baekjoon.p11000.p11500;

import java.io.*;
import java.util.*;

public class BOJ_11508_21세일 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int cost = 0;

        for (int i = 0; i < n; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        while (pq.size() >= 3) {
            cost += pq.poll() + pq.poll();
            pq.poll();
        }

        while (!pq.isEmpty()) {
            cost += pq.poll();
        }

        bw.write(Integer.toString(cost));
        br.close();
        bw.close();
    }
}
