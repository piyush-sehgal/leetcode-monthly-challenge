package com.leetcode.monthly._2021.feb._12;

/**
 * #1342 https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class NoOfSteps {
    public static void main(String[] args) {
        int num = -12;
        System.out.println(noOfSteps(num));
    }
    public static int noOfSteps(int n){
        int result = 0;
        while(n != 0){
            result += 1;
            if(n % 2 == 0){
                n /= 2;
            }
            else {
                n -= 1;
            }
        }
        return result;
    }
}
