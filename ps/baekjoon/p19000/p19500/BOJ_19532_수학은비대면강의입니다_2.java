/*
 * 문제: 백준 19532번 - 수학은 비대면강의입니다 (https://www.acmicpc.net/problem/19532)
 * 문제 풀이
 *  연립방정식의 두 식을 각각 y에 대해 정리한 뒤, 등치법을 사용하여 x에 대한 식을 도출.
 *  식 정리: (c - a * x) / b = (f - d * x) / e
 *  위 식을 x에 대해 정리하면 x = (c * e - f * b) / (a * e - d * b) 가 됨.
 *  문제에서 해가 유일하다고 했으므로 두 직선의 기울기는 다름. 따라서 분모(a * e - d * b)가 0이 되는 경우는 없음.
 *  구한 x를 이용해 y를 계산할 때, b가 0인 경우에는 두 번째 식을 이용하여 y를 구하고, 그렇지 않을 때는 첫 번째 식을 이용.
 *
 * 시간 복잡도: O(1)
 */

package baekjoon.p19000.p19500;

import java.io.*;
import java.util.*;

public class BOJ_19532_수학은비대면강의입니다_2 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int x = (c * e - f * b) / (a * e - d * b);
        int y = b == 0 ? (f - d * x) / e : (c - a * x) / b;

        bw.write(x + " " + y);
        br.close();
        bw.close();
    }
}
