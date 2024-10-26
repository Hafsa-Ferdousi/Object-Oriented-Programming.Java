/*Write a Java Program to Find Factorial of a Number.*/
//factoriar number of n! = n* (n-1) * (n-2) ...*1
//factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n


package com.mycompany.factorialnumber;

import java.util.Scanner;
public class Factorialnumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Numbetr:");
        int number=sc.nextInt();
        
        long factorial=1;
        
        for(int i=1; i<=number ;i++){
            
            factorial*=i;
        }
            System.out.println( number + "!="+ factorial);
        
    }
}
