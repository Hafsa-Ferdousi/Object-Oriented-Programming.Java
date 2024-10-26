/*
  1 
  1 2 
 1 2 3 
1 2 3 4
 */

package com.mycompany.spacenumpattern;

import java.util.Scanner;
public class Spacenumpattern {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the rows:");
        int rows=sc.nextInt();
        
        //outer loop for each row
        for(int i =1; i<= rows; i++){
            for(int j= rows-i;j>0;j--){
                System.out.print(" ");
            }
            //Print number in each row
            for(int j =1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        
    }
}
