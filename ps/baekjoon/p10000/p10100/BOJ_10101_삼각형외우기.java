/*
 * 문제: 백준 10101번 - 삼각형 외우기 (https://www.acmicpc.net/problem/10101)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p10000.p10100;

import java.io.*;

public class BOJ_10101_삼각형외우기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a + b + c == 180) {
            if (a == b && b == c) {
                bw.write("Equilateral");
            } else if (a == b || a == c || b == c) {
                bw.write("Isosceles");
            } else {
                bw.write("Scalene");
            }
        } else {
            bw.write("Error");
        }

        br.close();
        bw.close();
    }
}
