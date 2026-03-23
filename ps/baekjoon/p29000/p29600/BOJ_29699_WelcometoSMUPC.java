/*
 * 문제: 백준 29699번 - Welcome to SMUPC! (https://www.acmicpc.net/problem/29699)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p29000.p29600;

import java.io.*;

public class BOJ_29699_WelcometoSMUPC {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String label = "WelcomeToSMUPC";
        int n = Integer.parseInt(br.readLine());
        int index = (n - 1) % label.length();

        System.out.print(label.charAt(index));
    }
}
