

package com.mycompany.array2;

import java.util.Scanner;
public class Array2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size:");
        
        int size=sc.nextInt();
        int[]array=new int[size];
        System.out.println("Enter"+size+ "element");
        
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        
        for(int i=0;  i < size/2; i++){
            int temp = array[i];
            array[i]=array[size-1-i];
            array[size-1-i]=temp;
        }
        
        System.out.println("Reversed array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
