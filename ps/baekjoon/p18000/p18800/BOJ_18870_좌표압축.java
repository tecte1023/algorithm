/*
 * 문제: 백준 18870번 - 좌표 압축 (https://www.acmicpc.net/problem/18870)
 * 문제 풀이
 *  중복된 수는 같은 순위를 가지므로 HashSet을 이용해 중복 제거.
 *  중복이 제거된 수들을 오름차순으로 정렬하면, 리스트의 인덱스가 곧 압축된 좌표값(자신보다 작은 수의 개수)이 됨.
 *  원본 수열의 각 숫자가 정렬된 리스트의 어느 위치에 있는지 이분 탐색을 통해 찾아서 출력.
 *
 * 시간 복잡도: O(n log n)
 */

package baekjoon.p18000.p18800;

import java.io.*;
import java.util.*;

public class BOJ_18870_좌표압축 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                list.add(arr[i]);
            }
        }

        list.sort(Comparator.naturalOrder());

        for (int i = 0; i < n; i++) {
            sb.append(Collections.binarySearch(list, arr[i])).append(" ");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
