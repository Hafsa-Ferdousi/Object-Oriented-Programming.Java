/*Write a program called CheckOddEven which prints "Odd Number" if the int variable
“number” is odd, or “Even Number” otherwise. The program shall always print “bye!”
before exiting.*/


package com.mycompany.oddeven;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        
        System.out.print("Number-");
        int number= num.nextInt();
        if(number % 2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
            
           }
        System.out.println("bye!");
    }
    
    
    
}
