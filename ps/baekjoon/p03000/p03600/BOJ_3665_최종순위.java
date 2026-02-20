/*
 * 문제: 백준 3665번 - 최종 순위 (https://www.acmicpc.net/problem/3665)
 *  위상 정렬을 사용하여 올해 순위를 구함.
 *  작년 순위를 바탕으로 '나보다 순위가 낮은 모든 팀'을 향하는 간선을 생성하고, 진입 차수를 설정함.
 *  상대 순위가 바뀐 정보가 들어오면, 기존 간선의 방향을 뒤집고 두 팀의 진입 차수를 각각 갱신함.
 *  진입 차수가 0인 팀부터 순차적으로 탐색하며 새로운 순위를 결정함.
 *  사이클이 발생하여 모든 팀을 탐색하지 못하면 "IMPOSSIBLE"을 출력.
 *
 * 시간 복잡도: O(t * n²)
 *  t: 테스트 케이스 개수
 */

package baekjoon.p03000.p03600;

import java.io.*;
import java.util.*;

public class BOJ_3665_최종순위 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Set<Integer> nextTeams = new HashSet<>();
            Team[] teams = new Team[n + 1];

            for (int i = 1; i <= n; i++) {
                nextTeams.add(i);
                teams[i] = new Team();
            }

            for (int i = 1; i <= n; i++) {
                int team = Integer.parseInt(st.nextToken());

                nextTeams.remove(team);
                teams[team].rank = i;
                teams[team].next = new HashSet<>(nextTeams);

                for (int next : nextTeams) {
                    teams[next].indegree++;
                }
            }

            int m = Integer.parseInt(br.readLine());

            while (m-- > 0) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if (teams[a].rank > teams[b].rank) {
                    int tmp = a;

                    a = b;
                    b = tmp;
                }

                teams[a].next.remove(b);
                teams[b].indegree--;
                teams[b].next.add(a);
                teams[a].indegree++;
            }

            Queue<Integer> queue = new LinkedList<>();
            int cnt = 0;
            StringBuilder rank = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                if (teams[i].indegree == 0) {
                    queue.offer(i);
                }
            }

            while (!queue.isEmpty()) {
                int team = queue.poll();

                cnt++;
                rank.append(team).append(" ");

                for (int next : teams[team].next) {
                    if (--teams[next].indegree == 0) {
                        queue.offer(next);
                    }
                }
            }

            sb.append(cnt == n ? rank : "IMPOSSIBLE").append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static class Team {
        int rank = 0;
        int indegree = 0;
        Set<Integer> next;
    }
}
