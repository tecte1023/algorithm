/*
 * 문제: 백준 10986번 - 나머지 합 (https://www.acmicpc.net/problem/10986)
 * 문제 풀이
 *  누적 합과 모듈러 연산을 이용.
 *  특정 구간 `[i, j]`의 합이 `M`으로 나누어 떨어진다는 것은, 구간 합 공식에 의해 `(S[j] - S[i-1]) % M = 0`이 성립해야 함을 의미.
 *  위 식을 이항하여 정리하면 `S[j] % M = S[i-1] % M`이 되므로, 결국 누적 합의 나머지가 같은 두 인덱스를 찾는 문제로 귀결됨.
 *  수열을 순회하며 현재 누적 합의 나머지를 구하고, 이전에 등장했던 동일한 나머지의 개수만큼 정답에 합산.
 *  추가로 누적 합의 나머지 자체가 0인 경우는, 시작점부터 현재까지의 합이 나누어 떨어지는 경우이므로 정답에 +1.
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p10000.p10900;

import java.io.*;
import java.util.*;

public class BOJ_10986_나머지합 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] mod = new int[m];
        int sum = 0;
        long cnt = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            sum = (sum + Integer.parseInt(st.nextToken())) % m;
            cnt += mod[sum];
            mod[sum]++;

            if (sum == 0) {
                cnt++;
            }
        }

        bw.write(Long.toString(cnt));
        br.close();
        bw.close();
    }
}
