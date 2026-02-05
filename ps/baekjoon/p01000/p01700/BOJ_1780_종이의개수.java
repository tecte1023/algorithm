/*
 * 문제: 백준 1780번 - 종이의 개수 (https://www.acmicpc.net/problem/1780)
 * 문제 풀이
 *  분할 정복을 활용하여 종이를 더 이상 쪼갤 수 없거나 모두 같은 수로 이루어질 때까지 재귀적으로 탐색.
 *  현재 영역의 모든 숫자가 동일한지 확인하고, 하나라도 다를 경우 종이를 가로/세로로 3등분하여 총 9개의 영역으로 분할.
 *  분할된 각 영역에 대해 같은 과정을 반복하며, 모든 숫자가 동일한 영역을 발견하면 해당 숫자의 카운트를 증가시킴.
 *
 * 시간 복잡도: O(n² log₃ n)
 */

package baekjoon.p01000.p01700;

import java.io.*;
import java.util.*;

public class BOJ_1780_종이의개수 {
    // public class Main {
    private static int[][] paper;
    private static final int[] cnt = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        paper = new int[n][n];

        for (int i = 0; i < n; i++) {
            paper[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        count(0, 0, n);
        bw.write(cnt[0] + "\n" + cnt[1] + "\n" + cnt[2]);
        br.close();
        bw.close();
    }

    private static void count(int x, int y, int n) {
        int num = paper[x][y];

        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (num != paper[i][j]) {
                    n /= 3;
                    count(x, y, n);
                    count(x, y + n, n);
                    count(x, y + n * 2, n);
                    count(x + n, y, n);
                    count(x + n, y + n, n);
                    count(x + n, y + n * 2, n);
                    count(x + n * 2, y, n);
                    count(x + n * 2, y + n, n);
                    count(x + n * 2, y + n * 2, n);

                    return;
                }
            }
        }

        cnt[num + 1]++;
    }
}
