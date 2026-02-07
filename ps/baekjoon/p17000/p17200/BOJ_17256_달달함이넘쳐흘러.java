/*
 * 문제: 백준 17256번 - 달달함이 넘쳐흘러 (https://www.acmicpc.net/problem/17256)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p17000.p17200;

import java.io.*;
import java.util.*;

public class BOJ_17256_달달함이넘쳐흘러 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ax = Integer.parseInt(st.nextToken());
        int ay = Integer.parseInt(st.nextToken());
        int az = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int cx = Integer.parseInt(st.nextToken());
        int cy = Integer.parseInt(st.nextToken());
        int cz = Integer.parseInt(st.nextToken());

        bw.write((cx - az) + " " + (cy / ay) + " " + (cz - ax));
        br.close();
        bw.close();
    }
}
