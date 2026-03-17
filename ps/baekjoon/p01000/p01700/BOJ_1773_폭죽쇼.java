/*
 * 문제: 백준 1773번 - 폭죽쇼 (https://www.acmicpc.net/problem/1773)
 *
 * 시간 복잡도: O(n * l)
 *  n: 학생 수
 *  l: 폭죽쇼가 끝나는 시간
 */

package baekjoon.p01000.p01700;

import java.io.*;
import java.util.*;

public class BOJ_1773_폭죽쇼 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int studentCount = Integer.parseInt(st.nextToken());
        int endTime = Integer.parseInt(st.nextToken());
        boolean[] isExploded = new boolean[endTime + 1];
        int totalTime = 0;

        for (int i = 0; i < studentCount; i++) {
            int cycle = Integer.parseInt(br.readLine());

            recordExplosions(isExploded, cycle, endTime);
        }

        System.out.println(countExplosions(isExploded));
    }

    private static void recordExplosions(boolean[] timeline, int cycle, int limit) {
        for (int time = cycle; time <= limit; time += cycle) {
            timeline[time] = true;
        }
    }

    private static int countExplosions(boolean[] timeline) {
        int count = 0;

        for (boolean exploded : timeline) {
            if (exploded) {
                count++;
            }
        }

        return count;
    }
}
