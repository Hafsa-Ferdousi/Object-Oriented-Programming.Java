/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.company;

/**
 *
 * @author Asus
 */
public class Company   {

    public static void main(String[] args) {
        
        
        System.out.println("Hello World!");
        
        
        class company  {
            String name;
            int age;
            String role;
             public company(){
                 name= "mina" ;
                 age = 21;
                 role = "organize";
                 
                 //object create 
                /* company obj = new company();
                 System.out.println("Name: " +obj.name);
                 System.out.println("Age: " +obj.age);
                 System.out.println("Role:" +obj.role);*/
             }
        }
        
        company obj = new company();
                 System.out.println("Name: " +obj.name);
                 System.out.println("Age: " +obj.age);
                 System.out.println("Role:" +obj.role);
        System.out.println(" Thank you ");
    }
}
