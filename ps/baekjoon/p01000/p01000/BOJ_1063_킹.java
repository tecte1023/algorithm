/*
 * 문제: 백준 1063번 - 킹 (https://www.acmicpc.net/problem/1063)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p01000.p01000;

import java.io.*;
import java.util.*;

public class BOJ_1063_킹 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Piece k = new Piece(st.nextToken());
        Piece p = new Piece(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        while (n-- > 0) {
            int dx = 0;
            int dy = 0;

            for (char c : br.readLine().toCharArray()) {
                if (c == 'R') {
                    dx = 1;
                } else if (c == 'L') {
                    dx = -1;
                } else if (c == 'T') {
                    dy = 1;
                } else {
                    dy = -1;
                }
            }

            int kx = k.x + dx;
            int ky = k.y + dy;

            if (isOutOfBounds(kx, ky)) {
                continue;
            }

            if (kx == p.x && ky == p.y) {
                int px = p.x + dx;
                int py = p.y + dy;

                if (isOutOfBounds(px, py)) {
                    continue;
                }

                p.x = px;
                p.y = py;
            }

            k.x = kx;
            k.y = ky;
        }

        bw.write(k + "\n" + p);
        br.close();
        bw.close();
    }

    private static boolean isOutOfBounds(int x, int y) {
        return x < 0 || x >= 8 || y < 0 || y >= 8;
    }

    private static class Piece {
        int x, y;

        public Piece(String pos) {
            this.x = pos.charAt(0) - 'A';
            this.y = pos.charAt(1) - '1';
        }

        @Override
        public String toString() {
            return (char) ('A' + x) + "" + (char) ('1' + y);
        }
    }
}
