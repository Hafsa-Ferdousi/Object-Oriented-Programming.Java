
package com.mycompany.fibonacciscan;

import java.util.Scanner;
public class Fibonacciscan {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Number-");
        int number=sc.nextInt();
        
        long[] fibonacci= new long[number];
        
        fibonacci[0]=1;
        fibonacci[1]=1;
        for(int i=2;i<number;i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }
        
        System.out.println("The first"+ number +"Fibonacci numbers are:");
        for (long num: fibonacci){
            System.out.println(num + "");
        }
    }
}
