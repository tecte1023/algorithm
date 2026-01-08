/*
 * 문제: 백준 2751번 - 수 정렬하기 2 (https://www.acmicpc.net/problem/2751)
 *
 * 시간 복잡도: O(n log n)
 */

package baekjoon.p02000.p02700;

import java.io.*;
import java.util.*;

public class BOJ_2751_수정렬하기2 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);
        list.forEach(a -> sb.append(a).append("\n"));
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
