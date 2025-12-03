/*
 * 문제: 백준 17300번 - 패턴 (https://www.acmicpc.net/problem/17300)
 *
 * 시간 복잡도: O(l)
 */

package baekjoon.p17000.p17300;

import java.io.*;
import java.util.*;

public class BOJ_17300_패턴 {
    // public class Main {
    private static int l;
    private static StringTokenizer st;

    private static boolean solve() {
        boolean[] visited = new boolean[9];
        int prev = Integer.parseInt(st.nextToken()) - 1;

        visited[prev] = true;

        for (int i = 1; i < l; i++) {
            int next = Integer.parseInt(st.nextToken()) - 1;
            int rowDiff = Math.abs(prev / 3 - next / 3);
            int colDiff = Math.abs(prev % 3 - next % 3);

            if (visited[next]) {
                return false;
            }

            if (rowDiff == 0) {
                if (colDiff == 2 && !visited[next - next % 3 + 1]) {
                    return false;
                }
            } else if (rowDiff == 2) {
                if (colDiff == 0 && !visited[3 + next % 3]) {
                    return false;
                } else if (colDiff == 2 && !visited[4]) {
                    return false;
                }
            }

            visited[next] = true;
            prev = next;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        l = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        bw.write(solve() ? "YES" : "NO");
        br.close();
        bw.close();
    }
}
