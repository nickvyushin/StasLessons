package com.staslesson;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var num = sc.nextInt();
        if (num > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
