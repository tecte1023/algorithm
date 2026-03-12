/*
 * 문제: 백준 2693번 - N번째 큰 수 (https://www.acmicpc.net/problem/2693)
 *
 * 시간 복잡도: O(t)
 *  t: 테스트 케이스 수
 */

package baekjoon.p02000.p02600;

import java.io.*;
import java.util.*;

public class BOJ_2693_N번째큰수 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (testCase-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

            sb.append(arr[7]).append("\n");
        }

        System.out.print(sb);
    }
}
