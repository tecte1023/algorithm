/*
 * 문제: 백준 26069번 - 붙임성 좋은 총총이 (https://www.acmicpc.net/problem/26069)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p26000.p26000;

import java.io.*;
import java.util.*;

public class BOJ_26069_붙임성좋은총총이 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        set.add("ChongChong");

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (set.contains(a) || set.contains(b)) {
                set.add(a);
                set.add(b);
            }
        }

        bw.write(Integer.toString(set.size()));
        br.close();
        bw.close();
    }
}
