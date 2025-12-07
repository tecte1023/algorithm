/*
 * 문제: 백준 9498번 - 시험 성적 (https://www.acmicpc.net/problem/9498)
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p09000.p09400;

import java.io.*;

public class BOJ_9498_시험성적 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int grade = Integer.parseInt(br.readLine());

        switch (grade / 10) {
            case 10:
            case 9:
                bw.write("A");
                break;
            case 8:
                bw.write("B");
                break;
            case 7:
                bw.write("C");
                break;
            case 6:
                bw.write("D");
                break;
            default:
                bw.write("F");
        }

        br.close();
        bw.close();
    }
}
