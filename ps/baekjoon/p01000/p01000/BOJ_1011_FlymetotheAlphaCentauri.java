/*
 * 문제: 백준 1011번 - Fly me to the Alpha Centauri (https://www.acmicpc.net/problem/1011)
 * 문제 풀이
 *  이동 거리가 늘어남에 따라 속도가 1, 2, ..., k, ..., 2, 1 형태로 변화하며,
 *  이때 총 이동 거리와 최대 속도(k) 사이에는 제곱수 관계로 규칙성이 있음.
 *  k를 이동 거리의 제곱근으로 설정했을 때, 세 가지 구간으로 나누어 작동 횟수를 도출함.
 *  1. 이동 거리가 k²과 정확히 일치하는 경우: 작동 횟수는 2 * k - 1.
 *  2. 이동 거리가 k²보다 크고 k² + k보다 작거나 같은 경우: 작동 횟수는 2 * k.
 *  3. 이동 거리가 k² + k보다 큰 경우: 작동 횟수는 2 * k + 1.
 *
 * 시간 복잡도: O(t)
 */

package baekjoon.p01000.p01000;

import java.io.*;
import java.util.*;

public class BOJ_1011_FlymetotheAlphaCentauri {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int dist = y - x;
            long k = (long) Math.sqrt(dist);

            if (dist == k * k) {
                sb.append(k * 2 - 1);
            } else if (dist <= k * k + k) {
                sb.append(k * 2);
            } else {
                sb.append(k * 2 + 1);
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
