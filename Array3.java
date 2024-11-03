/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array3;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class Array3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("size-");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("ele-");
        
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
        int max=arr[0];
        for(int i =1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                
            }
        }
        System.out.println("max="+max);
    }
}
