//16. Write a Java program to display the number rhombus structure.



package com.mycompany.rhombuspattern;

import java.util.Scanner;
public class RhombusPattern {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Numer:");
        
        int n = sc.nextInt();
        //upper
        for(int i = 1; i<=n; i++){
            
            
            for(int j= i ;j<n;j++){
                System.out.print(" ");
             }
            for(int j=1; j<=i; j++){
                System.out.print(j);
                
            }
           /* for(int j= i ;j<n;j++){
                System.out.print(" ");*/
           
           for(int j =i-1; j>=1;j--){
               System.out.print(j);
           }
           
            System.out.println(); 
        }
        
          for (int i = n - 1; i >= 1; i--) {
              
              
          
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print numbers in decreasing order
            
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            
            System.out.println();
        }
    }
}
