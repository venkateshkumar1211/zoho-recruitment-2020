/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.interview;

/**
 *
 * @author venkat
 */
public class Practice {

    public static void main(String[] args) {
        String str = "WELCOME";
        int mid = str.length() / 2;
        String firstHalf = str.substring(mid, str.length());
        String secondHalf = str.substring(0, mid);
        str = firstHalf + secondHalf;
        print(str);

    }

    private static void print(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(str.charAt(k));
            }
            System.out.println("");
        }
    }

}
