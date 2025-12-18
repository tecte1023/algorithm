/*
 * 문제: 백준 25206번 - 너의 평점은 (https://www.acmicpc.net/problem/25206)
 *
 * 시간 복잡도: O(n)
 *  n: 수강한 전공과목의 개수
 */

package baekjoon.p25000.p25200;

import java.io.*;
import java.util.*;

public class BOJ_25206_너의평점은 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double sum = 0;
        double total = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double a = Double.parseDouble(st.nextToken());
            String b = st.nextToken();

            switch (b.charAt(0)) {
                case 'A':
                    sum += a * 4;
                    break;
                case 'B':
                    sum += a * 3;
                    break;
                case 'C':
                    sum += a * 2;
                    break;
                case 'D':
                    sum += a * 1;
                    break;
                case 'F':
                    total += a;
                default:
                    continue;
            }

            if (b.charAt(1) == '+') {
                sum += a * .5;
            }

            total += a;
        }

        bw.write(Double.toString(sum / total));
        br.close();
        bw.close();
    }
}
