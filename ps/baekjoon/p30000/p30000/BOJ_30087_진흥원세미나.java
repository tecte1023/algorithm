/*
 * 문제: 백준 30087번 - 진흥원 세미나 (https://www.acmicpc.net/problem/30087)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p30000.p30000;

import java.io.*;

public class BOJ_30087_진흥원세미나 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            switch (br.readLine().charAt(3)) {
                case 'o':
                    sb.append(204);
                    break;
                case 'a':
                    sb.append(207);
                    break;
                case 'i':
                    sb.append(302);
                    break;
                case 'e':
                    sb.append("B101");
                    break;
                case 'w':
                    sb.append(303);
                    break;
                case 'r':
                    sb.append(501);
                    break;
                default:
                    sb.append(105);
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
