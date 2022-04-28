package com.Bridgelabz_Day6;

import java.util.Scanner;

public class Perfect_Number {
    public static boolean isPerfect(int num)
    {
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        return sum==num;
    }

    public static void main(String[] args) {
        System.out.println("Please enter an number to check whether its perfect number");
        Scanner a=new Scanner(System.in);
        int num=a.nextInt();
        System.out.println("Entered Number is "+num);
        boolean ans=isPerfect(num);

        if(ans){
            System.out.println("The Number is an Perfect number");
        }
        else{
            System.out.println("The number is not an prime number");
        }
    }
}
