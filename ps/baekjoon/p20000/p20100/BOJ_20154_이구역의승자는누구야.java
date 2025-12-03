/*
 * 문제: 백준 20154번 - 이 구역의 승자는 누구야?! (https://www.acmicpc.net/problem/20154)
 *
 * 시간 복잡도: O(k)
 */

package ps.baekjoon.p20000.p20100;

import java.io.*;
import java.util.*;

public class BOJ_20154_이구역의승자는누구야 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int[] strokeCount = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < s.length(); i += 2) {
            list.add(strokeCount[s.charAt(i) - 'A'] + strokeCount[s.charAt(i - 1) - 'A']);
        }

        if (s.length() % 2 != 0) {
            list.add(strokeCount[s.charAt(s.length() - 1) - 'A']);
        }

        while (list.size() > 1) {
            List<Integer> newList = new ArrayList<>();

            for (int i = 1; i < list.size(); i += 2) {
                newList.add((list.get(i) + list.get(i - 1)) % 10);
            }

            if (list.size() % 2 != 0) {
                newList.add(list.get(list.size() - 1));
            }

            list = newList;
        }

        bw.write(list.get(0) % 2 == 0 ? "You're the winner?" : "I'm a winner!");
        br.close();
        bw.close();
    }
}
