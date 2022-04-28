package com.Bridgelabz_Day6;

import java.util.Scanner;
public class Prime_Number {
    public static boolean isPrime(int num)
    {
        if(num==1){
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("enter an number to check whether its an Prime number");
        Scanner a=new Scanner(System.in);
        int num=a.nextInt();
        System.out.println("num is "+num);
        boolean ans=isPrime(num);
        if(ans)
        {
            System.out.println("The number is an Prime number");
        }
        else {
            System.out.println("the number is not an prime number");
        }
    }
}
