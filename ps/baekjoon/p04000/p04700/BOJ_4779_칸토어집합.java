/*
 * 문제: 백준 4779번 - 칸토어 집합 (https://www.acmicpc.net/problem/4779)
 *
 * 시간 복잡도: O(3ⁿ)
 */

package baekjoon.p04000.p04700;

import java.io.*;

public class BOJ_4779_칸토어집합 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);

            bw.write(line(n));
            bw.newLine();
        }

        br.close();
        bw.close();
    }

    private static String line(int n) {
        if (n == 0) {
            return "-";
        }

        String l = line(n - 1);
        String e = empty(n - 1);

        return l + e + l;
    }

    private static String empty(int n) {
        if (n == 0) {
            return " ";
        }

        String e = empty(n - 1);

        return e + e + e;
    }
}
