package com.leetcode.monthly._2021.feb;

import java.util.Arrays;

/**
 https://leetcode.com/problems/shortest-distance-to-a-character/
 */
public class ShortestDistanceToChar {
    public static void main(String[] args) {
        /**
         *  "abcdefghijklmnopqrstuvwxyz" "z"
         *
         *  "piyush" "y"
         */
        String s = "HelloWorld";
        char c = 'o';
        int result[] = shortestToChar(s,c);
        for(int i = 0;i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    public static int[] shortestToChar(String s, char c) {
        int []result = new int[s.length()];
        int []left = new int[s.length()];
        int []right = new int[s.length()];
        int count = Integer.MAX_VALUE;
        Arrays.fill(left, Integer.MAX_VALUE);
        Arrays.fill(right, Integer.MAX_VALUE);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count = 0;
                left[i] = count;
            }
            else{
                if(count != Integer.MAX_VALUE){
                    count++;
                    left[i] = count;
                }
            }
        }
        count = Integer.MAX_VALUE;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == c){
                count = 0;
                right[i] = count;
            }
            else{
                if(count != Integer.MAX_VALUE){
                    count++;
                    right[i] = count;
                }
            }
        }
        for(int i = 0; i < s.length(); i++){
            System.out.print(left[i]);
            System.out.println(right[i]);
            result[i] = Math.min(left[i], right[i]);
        }
        return result;
    }
}
