/*
 * 문제: 백준 28136번 - 원, 탁! (https://www.acmicpc.net/problem/28136)
 * 문제 풀이
 *  오름차순이 유지되다가 끊기는 지점이 곧 구간의 경계가 됨.
 *  입력받은 수열을 순회하며 이러한 경계의 발생 횟수를 세고, 마지막 수와 첫 번째 수 사이의 관계도 확인하여 최종 개수를 계산.
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p28000.p28100;

import java.io.*;
import java.util.*;

public class BOJ_28136_원탁 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int prev = first;
        int cnt = 0;

        for (int i = 1; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());

            if (a <= prev) {
                cnt++;
            }

            prev = a;
        }

        if (first <= prev) {
            cnt++;
        }

        bw.write(Integer.toString(cnt));
        br.close();
        bw.close();
    }
}
