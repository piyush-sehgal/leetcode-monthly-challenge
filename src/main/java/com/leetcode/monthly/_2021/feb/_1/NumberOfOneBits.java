package com.leetcode.monthly._2021.feb._1;

import java.util.Scanner;

public class NumberOfOneBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();
        Integer test = Integer.parseInt(Integer.toBinaryString(number));
        System.out.println(test);
        Integer result = hammingWeight(test);
        System.out.println(result);
    }
    public static int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                count += 1;
            }
        }
        return count;
    }
}
