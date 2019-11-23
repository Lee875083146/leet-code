package com.nopainanymore.leetcode.algorithm;

import java.util.HashMap;

/**
 * leet-code: ValidAnagram
 *
 * @author NoPainAnymore
 * @date 2019-07-03 23:16
 * LeetCode 242
 */
public class ValidAnagram {

    private static Boolean isAnagram(String a, String b) {
        return anagramMap(a).equals(anagramMap(b));
    }

    private static HashMap<Character, Integer> anagramMap(String s) {
        HashMap<Character, Integer> anagramMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (anagramMap.containsKey(c)) {
                anagramMap.put(c, anagramMap.get(c) + 1);
            } else {
                anagramMap.put(c, 1);
            }
        }
        return anagramMap;
    }


    public static void main(String[] args) {
        String a = "art";
        String b = "rat";
        String c = "bat";
        System.out.println(isAnagram(a, b));
        System.out.println(isAnagram(a, c));
        String d = "anagram";
        String e = "margana";
        System.out.println(isAnagram(d, e));
    }

}
