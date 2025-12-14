/*
 * 문제: 백준 5622번 - 다이얼 (https://www.acmicpc.net/problem/5622)
 *
 * 시간 복잡도: O(n)
 *  n: 단어의 길이
 */

package baekjoon.p05000.p05600;

import java.io.*;

public class BOJ_5622_다이얼 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] time = {3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
        int sum = 0;

        for (char c : br.readLine().toCharArray()) {
            sum += time[c - 'A'];
        }

        bw.write(Integer.toString(sum));
        br.close();
        bw.close();
    }
}
