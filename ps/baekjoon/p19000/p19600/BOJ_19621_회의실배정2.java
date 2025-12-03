/*
 * 문제: 백준 19621번 - 회의실 배정 2 (https://www.acmicpc.net/problem/19621)
 * 문제 풀이
 *  DP를 사용하여 해결.
 *  회의들이 시간순으로 정렬되어 입력된다는 점을 이용하여, 현재 회의(i)를 선택할지 말지를 결정하는 점화식을 세움.
 *  - 현재 회의를 선택하지 않는 경우: 바로 전 단계까지의 최대 인원을 유지함.
 *  - 현재 회의를 선택하는 경우: 전전 단계의 최대 인원에 현재 회의 인원을 더함.
 *
 * 시간 복잡도: O(n)
 */

package ps.baekjoon.p19000.p19600;

import java.io.*;

public class BOJ_19621_회의실배정2 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] memo = new int[n + 2];

        for (int i = 2; i < memo.length; i++) {
            memo[i] = Math.max(memo[i - 1], memo[i - 2] + Integer.parseInt(br.readLine().split(" ")[2]));
        }

        bw.write(Integer.toString(memo[n + 1]));
        br.close();
        bw.close();
    }
}
