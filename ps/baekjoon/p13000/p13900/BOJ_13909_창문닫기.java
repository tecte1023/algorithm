/*
 * 문제: 백준 13909번 - 창문 닫기 (https://www.acmicpc.net/problem/13909)
 * 문제 풀이
 *  창문의 최종 상태는 해당 창문 번호가 가진 약수의 개수에 의해 결정됨.
 *  약수의 개수가 짝수라면 `닫힘 -> 열림 -> ... -> 닫힘` 순서로 초기 상태와 같아지고, 홀수라면 `열림` 상태로 남게 됨.
 *  일반적인 자연수의 약수는 `A * B = n` 형태의 쌍으로 존재하므로 항상 짝수 개를 가짐.
 *  약수가 홀수 개인 유일한 예외는 `X * X = n` 처럼 약수가 중복되는 완전제곱수일 때임.
 *  결론적으로 1부터 n까지의 수 중 완전제곱수의 개수를 구하는 문제가 됨.
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p13000.p13900;

import java.io.*;

public class BOJ_13909_창문닫기 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.write(Integer.toString((int) Math.sqrt(n)));
        br.close();
        bw.close();
    }
}
