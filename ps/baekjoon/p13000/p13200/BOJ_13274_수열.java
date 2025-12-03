/*
 * 문제: 백준 13274번 - 수열 (https://www.acmicpc.net/problem/13274)
 *
 * 시간 복잡도: O(k * n log n)
 */

package baekjoon.p13000.p13200;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class BOJ_13274_수열 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int k = Integer.parseInt(st.nextToken());
        long[] seq = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).sorted().toArray();

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken()) - 1;
            int r = Integer.parseInt(st.nextToken()) - 1;
            int x = Integer.parseInt(st.nextToken());

            for (int j = l; j <= r; j++) {
                seq[j] += x;
            }

            Arrays.sort(seq);
        }

        String result = Arrays.stream(seq).mapToObj(Long::toString).collect(Collectors.joining(" "));

        bw.write(result);
        br.close();
        bw.close();
    }
}
