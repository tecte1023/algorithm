/*
 * 문제: 백준 2696번 - 중앙값 구하기 (https://www.acmicpc.net/problem/2696)
 * 문제 풀이
 *  최대 힙과 최소 힙 두 개를 사용하여 데이터를 절반씩 나누어 저장함으로써 중앙값을 실시간으로 추적.
 *  중앙값을 기준으로 작은 값들은 최대 힙에, 큰 값들은 최소 힙에 담아 두 힙의 균형을 유지.
 *  새로운 원소가 들어올 때마다 재배치하여, 최대 힙의 상단이 현재 수열의 중앙값.
 *
 * 시간 복잡도: O(t * m log m)
 */

package baekjoon.p02000.p02600;

import java.io.*;
import java.util.*;

public class BOJ_2696_중앙값구하기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int m = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> low = new PriorityQueue<>(Comparator.reverseOrder());
            PriorityQueue<Integer> high = new PriorityQueue<>();
            int cnt = 0;

            sb.append(m / 2 + 1).append("\n");

            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                while (st.hasMoreTokens()) {
                    low.offer(Integer.parseInt(st.nextToken()));
                    high.offer(low.poll());

                    if (low.size() < high.size()) {
                        low.offer(high.poll());
                    }

                    if ((low.size() + high.size()) % 2 == 1) {
                        sb.append(low.peek()).append(" ");
                        cnt++;
                    }
                }

                m -= 10;

                if (m < 0) {
                    sb.append("\n");
                    break;
                } else if (cnt == 10) {
                    sb.append("\n");
                    cnt = 0;
                }
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
