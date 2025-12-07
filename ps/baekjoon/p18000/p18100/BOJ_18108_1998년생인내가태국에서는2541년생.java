/*
 * 문제: 백준 18108번 - 1998년생인 내가 태국에서는 2541년생?! (https://www.acmicpc.net/problem/18108)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p18000.p18100;

import java.io.*;

public class BOJ_18108_1998년생인내가태국에서는2541년생 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int y = Integer.parseInt(br.readLine());

        bw.write(Integer.toString(y - 543));
        br.close();
        bw.close();
    }
}
