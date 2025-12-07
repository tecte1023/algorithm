/*
 * 문제: 백준 3052번 - 나머지 (https://www.acmicpc.net/problem/3052)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p03000.p03000;

import java.io.*;
import java.util.*;

public class BOJ_3052_나머지 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(Integer.parseInt(br.readLine()) % 42);
        }

        bw.write(Integer.toString(set.size()));
        br.close();
        bw.close();
    }
}
