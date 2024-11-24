

package com.mycompany.addsubmuldiv;

import java.util.Scanner;
public class Addsubmuldiv {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number1: ");
        
        int num1 =sc.nextInt();
        System.out.print("Enter the number2: ");
        int num2 =sc.nextInt();
       int addition = num1 + num2 ;
       
        int subtraction = num1 - num2;
         int multiplication = num1 * num2;
        // double division = num1 / num2 ;
        if(num2==0){
            System.out.println("Division by zero is infinity"); 
            
        }else {
            double division =(double) num1 / num2 ;
            
            System.out.println("Divison: "+ division);
        
    }
               
        System.out.println("Addition: "+ addition);
        System.out.println("Subtractin: "+ subtraction);
        System.out.println("Multiplication: "+ multiplication);
        System.out.println("Mod:" + (num1% num2));
      
    }
}
