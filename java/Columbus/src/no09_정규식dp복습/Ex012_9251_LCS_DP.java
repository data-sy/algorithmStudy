package no09_정규식dp복습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex012_9251_LCS_DP {

    public static void main(String[] args) throws IOException {
        // https://www.acmicpc.net/problem/9251

        // LCS 공부 후 적용함

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int len1 = str1.length();
        int len2 = str2.length();

        int[][] dp = new int[len1+1][len2+1];
        for (int i=1; i<=len1; i++) {
            for (int j=1; j<=len2; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1)) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        System.out.println(dp[len1][len2]);
    }

}
