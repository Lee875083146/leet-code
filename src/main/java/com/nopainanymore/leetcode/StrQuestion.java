package com.nopainanymore.leetcode;

/**
 * leet-code: StrQuestion
 *
 * @author nopainanymore
 * @version 2019-11-23 11:12
 */
public class StrQuestion {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = "ab";
        String str4 = "c";
        String str5 = str3 + str4;

        System.out.println(str1 == str2);
        System.out.println(str1 == str5);

    }
}
