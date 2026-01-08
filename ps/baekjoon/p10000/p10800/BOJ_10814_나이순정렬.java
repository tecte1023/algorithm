/*
 * 문제: 백준 10814번 - 나이순 정렬 (https://www.acmicpc.net/problem/10814)
 *
 * 시간 복잡도: O(n log n)
 */

package baekjoon.p10000.p10800;

import java.io.*;
import java.util.*;

public class BOJ_10814_나이순정렬 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Member[] members = new Member[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            members[i] = new Member(i, Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(members, Comparator.comparingInt((Member a) -> a.age).thenComparingInt(a -> a.idx));

        for (int i = 0; i < n; i++) {
            sb.append(members[i].age).append(" ").append(members[i].name).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static class Member {
        int idx, age;
        String name;

        public Member(int idx, int age, String name) {
            this.idx = idx;
            this.age = age;
            this.name = name;
        }
    }
}
