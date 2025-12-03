/*
 * 문제: 백준 5635번 - 생일 (https://www.acmicpc.net/problem/5635)
 *
 * 시간 복잡도: O(n)
 */

package ps.baekjoon.p05000.p05600;

import java.io.*;
import java.util.*;

public class BOJ_5635_생일 {
    // public class Main {
    private static class Student {
        String name;
        int day, month, year;

        public Student(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        int day = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int year = Integer.parseInt(st.nextToken());
        Student younger = new Student(name, day, month, year);
        Student older = younger;

        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            day = Integer.parseInt(st.nextToken());
            month = Integer.parseInt(st.nextToken());
            year = Integer.parseInt(st.nextToken());
            Student student = new Student(name, day, month, year);

            if (year > younger.year) {
                younger = student;
            } else if (year == younger.year) {
                if (month > younger.month) {
                    younger = student;
                } else if (month == younger.month) {
                    if (day > younger.day) {
                        younger = student;
                    }
                }
            }

            if (year < older.year) {
                older = student;
            } else if (year == older.year) {
                if (month < older.month) {
                    older = student;
                } else if (month == older.month) {
                    if (day < older.day) {
                        older = student;
                    }
                }
            }
        }

        bw.write(younger.name + "\n" + older.name);
        br.close();
        bw.close();
    }
}
