

package com.mycompany.gcd;

import java.util.Scanner;
public class Gcd {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("1st num-");
        int num1=sc.nextInt();
        
        System.out.println("2st num-");
        int num2=sc.nextInt();
        
        int gcd=1;
        
        for(int i=1;i<=Math.min(num1, num2);i++){
            if(num1 % i ==0 && num2% i==0){
                gcd=i;
            }
        }
        
        System.out.println("GCD=  "+gcd);
    }
}
