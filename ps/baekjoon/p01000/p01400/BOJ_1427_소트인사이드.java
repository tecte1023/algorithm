/*
 * 문제: 백준 1427번 - 소트인사이드 (https://www.acmicpc.net/problem/1427)
 *
 * 시간 복잡도: O(m log m)
 *   m: 숫자의 자릿수
 */

package baekjoon.p01000.p01400;

import java.io.*;
import java.util.*;

public class BOJ_1427_소트인사이드 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }

        list.sort(Collections.reverseOrder());
        list.forEach(sb::append);
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
