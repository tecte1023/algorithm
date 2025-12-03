/*
 * 문제: 백준 2331번 - 반복수열 (https://www.acmicpc.net/problem/2331)
 * 문제 풀이
 *  각 항의 값을 Key로, 해당 항의 순서를 Value로 저장하는 해시맵을 사용하여 수열을 생성.
 *  다음 항을 계산할 때마다 맵에 이미 존재하는지 확인하여 사이클 발생 여부를 탐지.
 *  중복된 수가 발견되면, 맵에 저장되어 있던 해당 수가 처음 등장한 인덱스를 반환하여 반복 구간을 제외한 개수를 구함.
 *
 * 시간 복잡도: O(k)
 *  k: 반복이 발생하기 전까지 생성되는 수열의 길이.
 */

package baekjoon.p02000.p02300;

import java.io.*;
import java.util.*;

public class BOJ_2331_반복수열 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; ; i++) {
            int na = 0;

            map.put(a, i);

            while (a > 0) {
                na += (int) Math.pow(a % 10, p);
                a /= 10;
            }

            if (map.containsKey(na)) {
                bw.write(Integer.toString(map.get(na)));
                break;
            }

            a = na;
        }

        br.close();
        bw.close();
    }
}
