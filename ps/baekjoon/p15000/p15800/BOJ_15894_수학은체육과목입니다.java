/*
 * 문제: 백준 15894번 - 수학은 체육과목 입니다 (https://www.acmicpc.net/problem/15894)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p15000.p15800;

import java.io.*;

public class BOJ_15894_수학은체육과목입니다 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());

        bw.write(Long.toString(n * 4));
        br.close();
        bw.close();
    }
}
