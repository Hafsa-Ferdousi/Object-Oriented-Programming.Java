

package com.mycompany.factorial.wh;

import java.util.Scanner;
public class FactorialWh {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number-");
        int n=sc.nextInt();
        int i=1;
        long factorial=1;
        while(i<=n){
            factorial *= i;
            i++;
            
            
        }
        System.out.println(n + "!=" + factorial);     
    }
}
