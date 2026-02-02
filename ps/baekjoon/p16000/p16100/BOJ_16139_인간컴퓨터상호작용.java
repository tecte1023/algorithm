/*
 * 문제: 백준 16139번 - 인간-컴퓨터 상호작용 (https://www.acmicpc.net/problem/16139)
 * 문제 풀이
 *  누적 합 알고리즘을 적용하여 구간 합을 빠르게 구할 수 있도록 전처리 수행.
 *  문자열의 각 인덱스마다 알파벳별 등장 횟수를 누적하여 저장.
 *  특정 구간 `[l, r]` 내의 특정 알파벳 개수는 `(r까지의 누적 합) - (l 이전까지의 누적 합)`
 *
 * 시간 복잡도: O(n + q)
 *  n: 문자열 s의 길이
 */

package baekjoon.p16000.p16100;

import java.io.*;
import java.util.*;

public class BOJ_16139_인간컴퓨터상호작용 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());
        int[][] alphabet = new int[s.length() + 1][26];
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < alphabet.length; i++) {
            alphabet[i] = alphabet[i - 1].clone();
            alphabet[i][s.charAt(i - 1) - 'a']++;
        }

        while (q-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = st.nextToken().charAt(0) - 'a';
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            sb.append(alphabet[r + 1][a] - alphabet[l][a]).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
