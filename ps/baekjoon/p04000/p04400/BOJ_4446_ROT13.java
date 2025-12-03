/*
 * 문제: 백준 4446번 - ROT13 (https://www.acmicpc.net/problem/4446)
 *
 * 시간 복잡도: O(l)
 *  l: 입력된 전체 문자열의 길이
 */

package baekjoon.p04000.p04400;

import java.io.*;

public class BOJ_4446_ROT13 {
    // public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] vowels = {'a', 'i', 'y', 'e', 'o', 'u'};
        char[] consonants = {'b', 'k', 'x', 'z', 'n', 'h', 'd', 'c', 'w', 'g', 'p', 'v', 'j', 'q', 't', 's', 'r', 'l', 'm', 'f'};
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    boolean isUpperCase = false;

                    if (c < 'a') {
                        c += 32;
                        isUpperCase = true;
                    }

                    if (c == 'a' || c == 'i' || c == 'y' || c == 'e' || c == 'o' || c == 'u') {
                        for (int i = 0; i < vowels.length; i++) {
                            if (c == vowels[i]) {
                                c = vowels[(i - 3 + vowels.length) % vowels.length];
                                break;
                            }
                        }
                    } else {
                        for (int i = 0; i < consonants.length; i++) {
                            if (c == consonants[i]) {
                                c = consonants[(i - 10 + consonants.length) % consonants.length];
                                break;
                            }
                        }
                    }

                    if (isUpperCase) {
                        c -= 32;
                    }
                }

                sb.append(c);
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
