/*
 * 문제: 백준 2485번 - 가로수 (https://www.acmicpc.net/problem/2485)
 * 문제 풀이
 *  모든 가로수가 일정한 간격에 위치하려면, 설정해야 할 간격은 모든 인접한 가로수 사이 거리들의 최대공약수.
 *  유클리드 호제법을 활용하여 첫 번째 간격부터 순차적으로 누적된 최대공약수를 갱신.
 *  전체 구간의 길이(끝 위치 - 시작 위치)를 최종적으로 구해진 최대공약수로 나누면 '총 필요한 가로수의 간격 수'가 나옴.
 *  전체 가로수의 개수는 `총 간격 수 + 1`이므로, 여기서 `이미 심어진 가로수의 개수`를 빼서 추가로 심어야 할 가로수의 개수를 구함.
 *
 * 시간 복잡도: O(n * log(d))
 *  n: 입력된 가로수의 개수
 *  d: 가로수 사이의 거리값 중 최댓값
 */

package baekjoon.p02000.p02400;

import java.io.*;

public class BOJ_2485_가로수 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] trees = new int[n];

        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        int gcd = trees[1] - trees[0];

        for (int i = 2; i < n; i++) {
            gcd = gcd(gcd, trees[i] - trees[i - 1]);
        }

        bw.write(Integer.toString((trees[n - 1] - trees[0]) / gcd - n + 1));
        br.close();
        bw.close();
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
