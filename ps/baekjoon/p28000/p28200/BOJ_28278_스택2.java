/*
 * 문제: 백준 28278번 - 스택 2 (https://www.acmicpc.net/problem/28278)
 *
 * 시간 복잡도: O(n)
 */

package baekjoon.p28000.p28200;

import java.io.*;
import java.util.*;

public class BOJ_28278_스택2 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken().charAt(0)) {
                case '1':
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case '2':
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;
                case '3':
                    sb.append(stack.size()).append("\n");
                    break;
                case '4':
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                default:
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
