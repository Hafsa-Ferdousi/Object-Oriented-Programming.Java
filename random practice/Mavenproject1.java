

package com.mycompany.mavenproject1;

public class Mavenproject1 {
  static  int count =0;
   Mavenproject1(){
     count ++; 
       System.out.println( count );
          
   }
    public static void main(String[] args) {
        Mavenproject1 c1 = new Mavenproject1();
        Mavenproject1 c2 = new Mavenproject1();
        Mavenproject1 c3 = new Mavenproject1();
    }
}
