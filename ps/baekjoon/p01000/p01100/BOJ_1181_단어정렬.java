/*
 * 문제: 백준 1181번 - 단어 정렬 (https://www.acmicpc.net/problem/1181)
 *
 * 시간 복잡도: O(n log n)
 */

package baekjoon.p01000.p01100;

import java.io.*;
import java.util.*;

public class BOJ_1181_단어정렬 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        set.forEach(a -> sb.append(a).append("\n"));
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
