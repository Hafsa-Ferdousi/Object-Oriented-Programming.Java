/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.marks;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

 
public class Marks {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Marks-");
        int marks=sc.nextInt();
        if(marks<40){
            System.out.println("F");
        } else if (marks<=45){
                    System.out.println("D");
        }else{
                    System.out.println("A");
                   }
                    
                    
        
    }
}
