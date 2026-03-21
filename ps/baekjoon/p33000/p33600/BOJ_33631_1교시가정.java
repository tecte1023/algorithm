/*
 * 문제: 백준 33631번 - 1교시: 가정 (https://www.acmicpc.net/problem/33631)
 *
 * 시간 복잡도: O(q)
 *  q: 쿼리의 개수
 */

package baekjoon.p33000.p33600;

import java.io.*;
import java.util.*;

public class BOJ_33631_1교시가정 {
    // public class Main {
    private static int flour, chocolate, egg, butter;
    private static int requiredFlour, requiredChocolate, requiredEgg, requiredButter;
    private static int cookieCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        flour = Integer.parseInt(st.nextToken());
        chocolate = Integer.parseInt(st.nextToken());
        egg = Integer.parseInt(st.nextToken());
        butter = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        requiredFlour = Integer.parseInt(st.nextToken());
        requiredChocolate = Integer.parseInt(st.nextToken());
        requiredEgg = Integer.parseInt(st.nextToken());
        requiredButter = Integer.parseInt(st.nextToken());

        int query = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (query-- > 0) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int amount = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    if (canMakeCookies(amount)) {
                        makeCookies(amount);
                        sb.append(cookieCount).append("\n");
                    } else {
                        sb.append("Hello, siumii\n");
                    }

                    break;
                case 2:
                    flour += amount;
                    sb.append(flour).append("\n");
                    break;
                case 3:
                    chocolate += amount;
                    sb.append(chocolate).append("\n");
                    break;
                case 4:
                    egg += amount;
                    sb.append(egg).append("\n");
                    break;
                case 5:
                    butter += amount;
                    sb.append(butter).append("\n");
            }
        }

        System.out.print(sb);
    }

    private static boolean canMakeCookies(int amount) {
        return requiredFlour * amount <= flour
                && requiredChocolate * amount <= chocolate
                && requiredEgg * amount <= egg
                && requiredButter * amount <= butter;
    }

    private static void makeCookies(int amount) {
        flour -= requiredFlour * amount;
        chocolate -= requiredChocolate * amount;
        egg -= requiredEgg * amount;
        butter -= requiredButter * amount;

        cookieCount += amount;
    }
}
