package com.Bridgelabz_Day6;

import java.util.Scanner;
public class ReverseANumber {

    public static void main(String[] args) {
        int rev=0;
        System.out.println("Enter the number to be reversed");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        while(num!=0){

            int digit = num % 10;
            rev = rev * 10 + digit;
            num=num/10;


        }
        System.out.println("reversed number is "+rev);

    }
}
