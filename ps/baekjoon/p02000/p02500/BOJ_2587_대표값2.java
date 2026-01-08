/*
 * 문제: 백준 2587번 - 대표값2 (https://www.acmicpc.net/problem/2587)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p02000.p02500;

import java.io.*;
import java.util.*;

public class BOJ_2587_대표값2 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);
        bw.write((sum / 5) + "\n" + arr[2]);
        br.close();
        bw.close();
    }
}
