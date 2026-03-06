/*
 * 문제: 백준 32953번 - 회상 (https://www.acmicpc.net/problem/32953)
 *
 * 시간 복잡도: O(n * k)
 *  k: 과목의 수강생 수
 */

package baekjoon.p32000.p32900;

import java.io.*;
import java.util.*;

public class BOJ_32953_회상 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;

        while (n-- > 0) {
            br.readLine();
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                int k = Integer.parseInt(st.nextToken());

                map.put(k, map.getOrDefault(k, 0) + 1);
            }
        }

        for (int s : map.values()) {
            if (s >= m) {
                cnt++;
            }
        }

        bw.write(Integer.toString(cnt));
        br.close();
        bw.close();
    }
}
