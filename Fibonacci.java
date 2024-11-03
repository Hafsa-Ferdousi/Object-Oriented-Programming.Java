
package com.mycompany.fibonacci;


public class Fibonacci {

    public static void main(String[] args) {
        
        int n=20;
        int[] fibonaccinumber= new int[n];
        
        //intitilizing 1st two num;
        
        fibonaccinumber[0]=1;
        fibonaccinumber[1]=1;
        
           for(int i=2;i<n;i++)  {
                             
                fibonaccinumber[i]= fibonaccinumber[i-1]+ fibonaccinumber[i-2];
               
           }  
        System.out.println("Frist 20 fibonacci number are:");
        
        for(int num: fibonaccinumber){
            System.out.println(num + "");
            
        }
    }
}
