/*
 * 문제: 백준 3040번 - 백설 공주와 일곱 난쟁이 (https://www.acmicpc.net/problem/3040)
 *
 * 시간 복잡도: O(n²)
 *  n: 난쟁이의 수
 */

package baekjoon.p03000.p03000;

import java.io.*;

public class BOJ_3040_백설공주와일곱난쟁이 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
            sum += dwarf[i];
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j) {
                    continue;
                }

                if (sum - dwarf[i] - dwarf[j] == 100) {
                    StringBuilder sb = new StringBuilder();

                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            sb.append(dwarf[k]).append("\n");
                        }
                    }

                    System.out.print(sb);

                    return;
                }
            }
        }
    }
}
