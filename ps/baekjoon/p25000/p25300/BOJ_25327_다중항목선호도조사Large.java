/*
 * 문제: 백준 25327번 - 다중 항목 선호도 조사 (Large) (https://www.acmicpc.net/problem/25327)
 *
 * 시간 복잡도: O(n + m)
 */

package baekjoon.p25000.p25300;

import java.io.*;
import java.util.*;

public class BOJ_25327_다중항목선호도조사Large {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            String fruit = st.nextToken();
            String color = st.nextToken();
            String a = subject + " " + fruit + " " + color;
            String b = "- " + fruit + " " + color;
            String c = subject + " - " + color;
            String d = subject + " " + fruit + " -";
            String e = "- - " + color;
            String f = "- " + fruit + " -";
            String g = subject + " - -";
            String h = "- - -";

            map.put(a, map.getOrDefault(a, 0) + 1);
            map.put(b, map.getOrDefault(b, 0) + 1);
            map.put(c, map.getOrDefault(c, 0) + 1);
            map.put(d, map.getOrDefault(d, 0) + 1);
            map.put(e, map.getOrDefault(e, 0) + 1);
            map.put(f, map.getOrDefault(f, 0) + 1);
            map.put(g, map.getOrDefault(g, 0) + 1);
            map.put(h, map.getOrDefault(h, 0) + 1);
        }

        for (int i = 0; i < m; i++) {
            sb.append(map.getOrDefault(br.readLine(), 0)).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
