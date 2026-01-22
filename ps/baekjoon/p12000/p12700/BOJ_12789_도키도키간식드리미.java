/*
 * 문제: 백준 12789번 - 도키도키 간식드리미 (https://www.acmicpc.net/problem/12789)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p12000.p12700;

import java.io.*;
import java.util.*;

public class BOJ_12789_도키도키간식드리미 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int p = 1;
        String result = "Nice";

        while (p <= n) {
            if (!stack.isEmpty() && stack.peek() == p) {
                stack.pop();
                p++;
            } else if (st.hasMoreTokens()) {
                int student = Integer.parseInt(st.nextToken());

                if (student == p) {
                    p++;
                } else {
                    stack.add(student);
                }
            } else {
                result = "Sad";
                break;
            }
        }

        bw.write(result);
        br.close();
        bw.close();
    }
}
