/*
 * 문제: 백준 16488번 - 피카츄가 낸 어려운 문제 (https://www.acmicpc.net/problem/16488)
 *
 * 시간 복잡도: O(1)
 */

package ps.baekjoon.p16000.p16400;

import java.io.*;
import java.util.*;

public class BOJ_16488_피카츄가낸어려운문제 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bw.write(Long.toString((long) n * n * k));
        br.close();
        bw.close();
    }
}
