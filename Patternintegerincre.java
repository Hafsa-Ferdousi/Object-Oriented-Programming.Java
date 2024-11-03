

package com.mycompany.patternintegerincre;

import java.util.Scanner;
public class Patternintegerincre {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Rows:");
        
        int Row=sc.nextInt();
        for(int i=1;i<=Row;i++){
      
            for(int j=1;j<=i;j++){
                System.out.print(j );
                System.out.print(" ");
            }
            
            System.out.println();
        }
        
    }
    
        
        
}
