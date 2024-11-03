/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class Mavenproject6 {

    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in); 
        System.out.println("Size-");
        int size =sc.nextInt();
        
        int[]array=new int[size];
        
        System.out.println("Element-");
        for(int i=0;i<size;i++){
            
        
           array[i]=sc.nextInt();
        }
        int max=array[0];
        for(int i=0;i<size;i++){
            if (array[i]> max){
            max=array[i];
            
        }
            
        }
        System.out.println("max="+ max);
    }
}
