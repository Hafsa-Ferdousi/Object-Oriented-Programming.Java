
/*
1******
12*****
123****
1234***
12345**
123456*
1234567
*/

package com.mycompany.stardigitboth;

import java.util.Scanner;
public class StardigitBoth {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows-");
        int row=sc.nextInt();
        
        
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i;j++){
                System.out.print( j );   //num print {1,2...;
            }
            for(int k=row;k>i;k--){
                System.out.print("*");
            }
            
            
            System.out.println();
        }
        
                
    }
}
