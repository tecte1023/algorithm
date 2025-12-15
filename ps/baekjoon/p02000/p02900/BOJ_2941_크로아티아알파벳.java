/*
 * 문제: 백준 2941번 - 크로아티아 알파벳 (https://www.acmicpc.net/problem/2941)
 *
 * 시간 복잡도: O(n)
 *  n: 단어의 길이
 */

package baekjoon.p02000.p02900;

import java.io.*;

public class BOJ_2941_크로아티아알파벳 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine()
                .replace("c=", "0")
                .replace("c-", "0")
                .replace("dz=", "0")
                .replace("d-", "0")
                .replace("lj", "0")
                .replace("nj", "0")
                .replace("s=", "0")
                .replace("z=", "0");

        bw.write(Integer.toString(str.length()));
        br.close();
        bw.close();
    }
}
