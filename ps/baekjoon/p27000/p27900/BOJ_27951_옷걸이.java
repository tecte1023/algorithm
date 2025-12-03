/*
 * 문제: 백준 27951번 - 옷걸이 (https://www.acmicpc.net/problem/27951)
 * 문제 풀이
 *  옷걸이의 용도가 고정된 경우의 개수를 미리 세어, 필요한 옷의 개수보다 고정된 개수가 더 많으면 불가능 처리.
 *  가능한 경우, 용도가 자유로운 옷걸이에는 부족한 상의 개수를 먼저 채우고, 남은 자리는 모두 하의로 채우는 방식으로 배정.
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p27000.p27900;

import java.io.*;
import java.util.*;

public class BOJ_27951_옷걸이 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] hanger = new int[n];
        int uh = 0;
        int dh = 0;

        for (int i = 0; i < n; i++) {
            hanger[i] = Integer.parseInt(st.nextToken());

            if (hanger[i] == 1) {
                uh++;
            } else if (hanger[i] == 2) {
                dh++;
            }
        }

        st = new StringTokenizer(br.readLine());
        int u = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        if (u < uh || d < dh) {
            sb.append("NO");
        } else {
            sb.append("YES\n");
            u -= uh;

            for (int i = 0; i < n; i++) {
                if (hanger[i] == 1) {
                    sb.append('U');
                } else if (hanger[i] == 2) {
                    sb.append('D');
                } else if (u > 0) {
                    sb.append('U');
                    u--;
                } else {
                    sb.append('D');
                }
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
