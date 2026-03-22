/*
 * 문제: 백준 9656번 - 돌 게임 2 (https://www.acmicpc.net/problem/9656)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p09000.p09600;

import java.io.*;

public class BOJ_9656_돌게임2 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stone = Integer.parseInt(br.readLine());

        System.out.print(stone % 2 == 0 ? "SK" : "CY");
    }
}
