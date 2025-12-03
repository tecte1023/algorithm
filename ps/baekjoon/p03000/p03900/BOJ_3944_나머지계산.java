/*
 * 문제: 백준 3944번 - 나머지 계산 (https://www.acmicpc.net/problem/3944)
 * 문제 풀이
 *  10진법에서 각 자릿수의 합을 9로 나눈 나머지가 원래 수를 9로 나눈 나머지와 같다는 성질을 B진법으로 일반화한 문제임.
 *  B ≡ 1 (mod B-1)이므로, B^k ≡ 1^k ≡ 1 (mod B-1)이 성립함.
 *  따라서 B진법으로 표현된 수 D를 B-1로 나눈 나머지는 모든 자릿수의 합을 B-1로 나눈 나머지와 같음.
 *
 * 시간 복잡도: O(l)
 *  l: 입력된 수 D의 자릿수
 */

package ps.baekjoon.p03000.p03900;

import java.io.*;
import java.util.*;

public class BOJ_3944_나머지계산 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            String d = st.nextToken();
            int m = b - 1;
            int r = 0;

            for (int i = 0; i < d.length(); i++) {
                r = (r + (d.charAt(i) - '0')) % m;
            }

            sb.append(r).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
