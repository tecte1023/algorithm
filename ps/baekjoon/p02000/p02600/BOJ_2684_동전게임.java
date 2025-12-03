/*
 * 문제: 백준 2684번 - 동전 게임 (https://www.acmicpc.net/problem/2684)
 *
 * 시간 복잡도: O(p)
 */

package ps.baekjoon.p02000.p02600;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class BOJ_2684_동전게임 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int p = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (p-- > 0) {
            StringBuilder s = new StringBuilder(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            map.put("TTT", 0);
            map.put("TTH", 0);
            map.put("THT", 0);
            map.put("THH", 0);
            map.put("HTT", 0);
            map.put("HTH", 0);
            map.put("HHT", 0);
            map.put("HHH", 0);

            for (int i = 3; i <= s.length(); i++) {
                String sub = s.substring(i - 3, i);

                map.put(sub, map.get(sub) + 1);
            }

            sb.append(map.entrySet().stream()
                            .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                            .map(Map.Entry::getValue)
                            .map(String::valueOf)
                            .collect(Collectors.joining(" ")))
                    .append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
