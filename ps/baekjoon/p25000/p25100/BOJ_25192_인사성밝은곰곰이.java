/*
 * 문제: 백준 25192번 - 인사성 밝은 곰곰이 (https://www.acmicpc.net/problem/25192)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p25000.p25100;

import java.io.*;
import java.util.*;

public class BOJ_25192_인사성밝은곰곰이 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if (s.equals("ENTER")) {
                cnt += set.size();
                set = new HashSet<>();
            } else {
                set.add(s);
            }
        }

        cnt += set.size();
        bw.write(Integer.toString(cnt));
        br.close();
        bw.close();
    }
}
