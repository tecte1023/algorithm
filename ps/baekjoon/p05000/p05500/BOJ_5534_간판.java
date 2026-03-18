/*
 * 문제: 백준 5534번 - 간판 (https://www.acmicpc.net/problem/5534)
 *
 * 시간 복잡도: O(n * m² * l)
 *  n: 오래된 간판의 수
 *  m: 오래된 간판의 길이
 *  l: 편의점 이름의 길이
 */

package baekjoon.p05000.p05500;

import java.io.*;

public class BOJ_5534_간판 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int signCount = Integer.parseInt(br.readLine());
        String targetSign = br.readLine();
        int validCount = 0;

        for (int i = 0; i < signCount; i++) {
            String oldSign = br.readLine();

            if (canMakeSign(oldSign, targetSign)) {
                validCount++;
            }
        }

        System.out.print(validCount);
    }

    private static boolean canMakeSign(String oldSign, String targetSign) {
        int oldLen = oldSign.length();
        int targetLen = targetSign.length();

        for (int start = 0; start < oldLen; start++) {
            if (oldSign.charAt(start) != targetSign.charAt(0)) {
                continue;
            }

            for (int second = start + 1; second < oldLen; second++) {
                if (oldSign.charAt(second) != targetSign.charAt(1)) {
                    continue;
                }

                int gap = second - start;

                if (start + gap * (targetLen - 1) >= oldLen) {
                    break;
                }

                if (matchesWithGap(oldSign, targetSign, start, gap)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean matchesWithGap(String oldSign, String targetSign, int start, int gap) {
        for (int step = 2; step < targetSign.length(); step++) {
            if (oldSign.charAt(start + gap * step) != targetSign.charAt(step)) {
                return false;
            }
        }

        return true;
    }
}
