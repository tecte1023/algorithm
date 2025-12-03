/*
 * 문제: 백준 31066번 - 비 오는 날 (https://www.acmicpc.net/problem/31066)
 *
 * 시간 복잡도: O(n / (m * k))
 */

package ps.baekjoon.p31000.p31000;

import java.io.*;
import java.util.*;

public class BOJ_31066_비오는날 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if (m == 1 && k == 1 && n > 1) {
                sb.append(-1).append("\n");
            } else {
                int cnt = -1;

                do {
                    n -= m * k;
                    cnt += 2;
                } while (n++ > 0);

                sb.append(cnt).append("\n");
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
