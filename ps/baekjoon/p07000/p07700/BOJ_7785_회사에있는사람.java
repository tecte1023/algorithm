/*
 * 문제: 백준 7785번 - 회사에 있는 사람 (https://www.acmicpc.net/problem/7785)
 *
 * 시간 복잡도: O(n log n)
 */

package baekjoon.p07000.p07700;

import java.io.*;
import java.util.*;

public class BOJ_7785_회사에있는사람 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();

            if (st.nextToken().charAt(0) == 'e') {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        set.forEach(name -> sb.append(name).append("\n"));
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
