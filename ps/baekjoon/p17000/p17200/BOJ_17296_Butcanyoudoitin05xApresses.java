/*
 * 문제: 백준 17296번 - But can you do it in 0.5x A presses? (https://www.acmicpc.net/problem/17296)
 *
 * 시간 복잡도: O(n)
 */

package ps.baekjoon.p17000.p17200;

import java.io.*;
import java.util.*;

public class BOJ_17296_Butcanyoudoitin05xApresses {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            double a = Double.parseDouble(st.nextToken());

            cnt += (int) (cnt == 0 ? Math.round(a) : a);
        }

        bw.write(Integer.toString(cnt));
        br.close();
        bw.close();
    }
}
