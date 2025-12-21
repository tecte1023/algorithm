/*
 * 문제: 백준 1193번 - 분수찾기 (https://www.acmicpc.net/problem/1193)
 * 문제 풀이
 *  대각선 라인마다 포함된 분수의 개수가 1개, 2개, 3개...로 1씩 증가하는 등차수열의 규칙을 이용.
 *  입력된 x에서 1, 2, 3...을 차례대로 빼면서 x가 몇 번째 대각선에 속하는지, 그리고 그 안에서 몇 번째 순서인지 탐색.
 *  대각선 번호가 짝수일 때는 위에서 아래로, 홀수일 때는 아래에서 위로 진행하여 분자/분모를 결정.
 *
 * 시간 복잡도: O(√x)
 */

package baekjoon.p01000.p01900;

import java.io.*;

public class BOJ_1193_분수찾기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());

        for (int i = 1; ; i++) {
            if (x <= i) {
                bw.write(i % 2 == 0 ? x + "/" + (i - x + 1) : (i - x + 1) + "/" + x);
                break;
            }

            x -= i;
        }

        br.close();
        bw.close();
    }
}
