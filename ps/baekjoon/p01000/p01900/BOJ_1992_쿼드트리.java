/*
 * 문제: 백준 1992번 - 쿼드트리 (https://www.acmicpc.net/problem/1992)
 * 문제 풀이
 *  분할 정복 알고리즘을 사용.
 *  현재 주어진 영역 내의 모든 픽셀 값이 같은지 검사.
 *  만약 모든 값이 같다면 해당 숫자로 압축.
 *  값이 섞여 있다면 영역을 4개로 나눠 각 영역에 대해 재귀적으로 압축 과정을 수행하고,
 *  그 결과를 괄호로 감싸서 이어 붙임.
 *
 * 시간 복잡도: O(n² log n)
 */

package baekjoon.p01000.p01900;

import java.io.*;

public class BOJ_1992_쿼드트리 {
    // public class Main {
    private static boolean[][] image;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        image = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            for (int j = 0; j < n; j++) {
                image[i][j] = s.charAt(j) == '1';
            }
        }

        bw.write(compress(0, 0, n));
        br.close();
        bw.close();
    }

    private static String compress(int x, int y, int n) {
        if (isCompressible(x, y, n)) {
            return image[x][y] ? "1" : "0";
        }

        n /= 2;

        return "(" + compress(x, y, n) + compress(x, y + n, n) + compress(x + n, y, n) + compress(x + n, y + n, n) + ")";
    }

    private static boolean isCompressible(int x, int y, int n) {
        boolean dot = image[x][y];

        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (dot ^ image[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
