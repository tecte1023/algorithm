/*
 * 문제: 백준 2903번 - 중앙 이동 알고리즘 (https://www.acmicpc.net/problem/2903)
 * 문제 풀이
 *  과정을 반복할 때마다 정사각형 한 변의 구획 수가 2배씩 늘어남.
 *  한 변에 놓이는 점의 개수는 항상 (구획 수 + 1)이므로, N번 거친 후 한 변의 점 개수는 (2ⁿ + 1)이 됨.
 *  정사각형 격자 형태이므로, 전체 점의 개수는 한 변의 점 개수를 제곱한 값.
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p02000.p02900;

import java.io.*;

public class BOJ_2903_중앙이동알고리즘 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int p = (1 << n) + 1;

        bw.write(Integer.toString(p * p));
        br.close();
        bw.close();
    }
}
