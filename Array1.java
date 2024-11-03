//Sum of Elements in a 1D array

package com.mycompany.array1;

import java.util.Scanner;
public class Array1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Size-");
        int n =sc.nextInt();
        
        //create a array to hold the array
        int[] array = new int[n];
        System.out.println("Enter the element:");
        
        for(int i =0; i<n; i++){
            array[i]=sc.nextInt();
        }
         
        int sum=0;
        for(int i= 0;i<n;i++){
            sum+=array[i];
        }
        System.out.println("the sum of the element is:"+sum);
    }
}
