/*
 * 문제: 백준 3679번 - 단순 다각형 (https://www.acmicpc.net/problem/3679)
 * 문제 풀이
 *  y좌표가 가장 낮은(동일하면 x좌표가 낮은) 점을 기준점으로 잡고, 나머지 점들을 반시계 방향(CCW) 각도 순으로 정렬.
 *  이때 각도가 동일한(일직선상에 있는) 점들은 기준점에서 가까운 순서대로 정렬.
 *  단순 다각형을 완성하기 위해, 정렬된 점들 중 마지막 변(가장 큰 각도)에 포함된 일직선 상의 점들의 순서를 뒤집어서 출력.
 *
 * 시간 복잡도: O(n log n)
 */

package ps.baekjoon.p03000.p03600;

import java.io.*;
import java.util.*;

public class BOJ_3679_단순다각형 {
    // public class Main {
    private static int ccw(Vertex a, Vertex b, Vertex c) {
        return (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x);
    }

    private static class Vertex {
        int id, x, y;

        public Vertex(int id, int x, int y) {
            this.id = id;
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (c-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            Vertex[] vertexes = new Vertex[n];
            Vertex anchor = new Vertex(-1, Integer.MAX_VALUE, Integer.MAX_VALUE);

            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                vertexes[i] = new Vertex(i, x, y);

                if (anchor.y > y || (anchor.y == y && anchor.x > x)) {
                    anchor.x = x;
                    anchor.y = y;
                }
            }

            Arrays.sort(vertexes, (a, b) -> {
                int cross = ccw(anchor, a, b);

                if (cross == 0) {
                    int distA = (a.x - anchor.x) * (a.x - anchor.x) + (a.y - anchor.y) * (a.y - anchor.y);
                    int distB = (b.x - anchor.x) * (b.x - anchor.x) + (b.y - anchor.y) * (b.y - anchor.y);

                    return distA - distB;
                }

                return -cross;
            });

            int flag = n - 1;

            while (ccw(anchor, vertexes[flag - 1], vertexes[flag]) == 0) {
                flag--;
            }

            for (int i = 0; i < flag; i++) {
                sb.append(vertexes[i].id).append(" ");
            }

            for (int i = n - 1; i >= flag; i--) {
                sb.append(vertexes[i].id).append(" ");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
