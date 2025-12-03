/*
 * 문제: 백준 18187번 - 평면 분할 (https://www.acmicpc.net/problem/18187)
 * 문제 풀이
 *  교점이 많을수록 면이 많이 생기므로, 직선들을 세 가지 기울기 그룹에 최대한 균등하게 배분해야 함.
 *  교점의 개수는 전체 직선 쌍의 수에서 평행하여 만나지 않는 직선 쌍의 수를 빼서 구함.
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p18000.p18100;

import java.io.*;

public class BOJ_18187_평면분할 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int d = n / 3;
        int m = n % 3;
        int r = 1 + n + (n * n - d * d * (3 - m) - (d + 1) * (d + 1) * m) / 2;

        bw.write(Integer.toString(r));
        br.close();
        bw.close();
    }
}
