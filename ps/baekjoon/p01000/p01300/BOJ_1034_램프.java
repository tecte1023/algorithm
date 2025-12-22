/*
 * 문제: 백준 1034번 - 램프 (https://www.acmicpc.net/problem/1034)
 * 문제 풀이
 *  동시에 켜질 수 있는 행들은 초기 상태가 서로 같아야 하므로 그리디 성질을 이용.
 *  스위치 조작은 해당 열 전체에 영향을 주므로, 0과 1의 배치 패턴이 다른 두 행을 동시에 모두 1인 상태로 만드는 것은 불가능함.
 *  각 행을 패턴으로 분류한 뒤, 각 패턴을 모두 1로 만듦.
 *  이때, 1로 만들기 위한 필요 조작 횟수(행의 0의 개수)가 k보다 작거나 같고,
 *  k - 0의 개수가 짝수여야 함. (남은 횟수는 같은 스위치를 켰다 껐다하며 상쇄)
 *  가장 많이 등장한 패턴의 개수가 정답.
 *
 * 시간 복잡도: O(n * m)
 */

package baekjoon.p01000.p01300;

import java.io.*;
import java.util.*;

public class BOJ_1034_램프 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<Long, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            long row = Long.parseLong(br.readLine(), 2);

            map.put(row, map.getOrDefault(row, 0) + 1);
        }

        int k = Integer.parseInt(br.readLine());

        for (long row : map.keySet()) {
            int lamp = map.get(row);
            int cnt = m - Long.bitCount(row);

            if (lamp > max && cnt <= k && cnt % 2 == k % 2) {
                max = lamp;
            }
        }

        bw.write(Integer.toString(max));
        br.close();
        bw.close();
    }
}
