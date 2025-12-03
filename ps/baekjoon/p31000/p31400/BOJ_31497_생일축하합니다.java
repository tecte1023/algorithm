/*
 * 문제: 백준 31497번 - 생일 축하합니다~ (https://www.acmicpc.net/problem/31497)
 *
 * 시간 복잡도: O(n)
 */

package ps.baekjoon.p31000.p31400;

import java.io.*;

public class BOJ_31497_생일축하합니다 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            bw.write("? " + names[i] + "\n");
            bw.flush();

            String a = br.readLine();

            bw.write("? " + names[i] + "\n");
            bw.flush();

            String b = br.readLine();

            if (!a.equals(b)) {
                bw.write("! " + names[i]);
                break;
            }
        }

        br.close();
        bw.close();
    }
}
