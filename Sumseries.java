/*
 Write a program to calculate the sum of following series where n is the input given by the
user.
1 + 1/2 + 1/3 + 1/4 + 1/5 +............1/n
 */

package com.mycompany.sumseries;

import java.util.Scanner;
public class Sumseries {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number(n)-");
        int n = sc.nextInt();
        
        //variable to store the sum 
        double sum=0.00;
        
        //for loop to calculate the sum of this series;
        
        for(int i =1;i<=n;i++){
            
            sum+= 1.0/i;  //sum=sum+(1/i) [adding 1/i]
        
    }
        
        System.out.println("The sum of the series:" + sum);
    }
}
