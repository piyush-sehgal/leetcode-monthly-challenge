package com.leetcode.monthly._2021.feb._17;

/**
 * #11 https://leetcode.com/problems/container-with-most-water/
 */
public class MaxWaterInContainer {
    public static void main(String[] args) {
        int []arr = {1,8,6,2,5,4,8,3,7};
        /**
         *  arr = [1,8,6,2,5,4,8,3,7]  area = 49
         *  arr = [1,1]    area = 1
         *  arr = [4,3,2,1,4]    area = 16
         *  arr = [1,2,1]   area = 2
         */
        System.out.println(maxArea(arr)); //Brute force approach
        System.out.println(maxAreaOptimized(arr));// Two pointer approach
    }
    public static int maxArea(int[] arr) {
        /**
         * TC: O(n^2)
         * SC: O(1)
         */
        int area = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                area = Math.max(area, Math.min(arr[i], arr[j]) * (j - i));
            }
        }
        return area;
    }

    public static int maxAreaOptimized(int[] arr){
        /**
         * TC: O(n)
         * SC: O(1)
         */
        int area = 0;
        int left = 0, right = arr.length - 1;
        while (left < right){
            area = Math.max(area, Math.min(arr[left], arr[right]) * (right - left));
            if(arr[left] < arr[right]){
                left += 1;
            }
            else{
                right -= 1;
            }
        }
        return area;
    }
}
