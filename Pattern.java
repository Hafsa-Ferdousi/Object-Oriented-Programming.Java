
package com.mycompany.pattern;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size:");
        int size=sc.nextInt();
        
        //outer loop for rows
        for(int i =0;i<size;i++){
            //iner loop for colums
            for(int j=0;j<size;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
