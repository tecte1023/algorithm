/*
 * 문제: 백준 9753번 - 짝 곱 (https://www.acmicpc.net/problem/9753)
 * 문제 풀이
 * 에라토스테네스의 체를 사용하여 범위 내의 모든 소수를 미리 구하여 리스트에 저장.
 * 각 테스트 케이스마다 이중 반복문을 사용하여 두 서로 다른 소수의 곱을 탐색.
 * 탐색 범위를 줄이기 위해 현재 구한 최솟값보다 곱의 결과가 커지거나,
 * 첫 번째 소수의 제곱이 이미 최솟값을 넘으면 가지치기를 적용하여 효율적으로 K 이상의 최솟값을 찾음.
 *
 * 시간 복잡도: O(m log log m + t * p²)
 *  m: 범위의 최댓값(100,000)
 *  p: 범위 내 소수의 개수
 */

package ps.baekjoon.p09000.p09700;

import java.io.*;
import java.util.*;

public class BOJ_9753_짝곱 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        boolean[] np = new boolean[100001];
        List<Integer> primes = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        np[0] = np[1] = true;

        for (int i = 2; i < np.length; i++) {
            if (np[i]) {
                continue;
            }

            primes.add(i);

            for (long j = (long) i * i; j < np.length; j += i) {
                np[(int) j] = true;
            }
        }

        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            long min = Long.MAX_VALUE;

            if (k <= 6) {
                sb.append(6).append("\n");
                continue;
            }

            for (int i = 0; i < primes.size(); i++) {
                int p = primes.get(i);

                if ((long) p * p >= min) {
                    break;
                }

                for (int j = i + 1; j < primes.size(); j++) {
                    int num = p * primes.get(j);

                    if (num < k) {
                        continue;
                    } else if (num >= min) {
                        break;
                    }

                    min = num;
                }
            }

            sb.append(min).append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
