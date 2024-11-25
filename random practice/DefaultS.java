/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.defaults;

/**
 *
 * @author Asus
 */
  class See{
      String name;
      int age;
      boolean men;
      float taka;
      double hight;
      char gender;
      byte b;
      short s;
      long L;
      
              
 }
public class DefaultS {

    public static void main(String[] args) {
        
        See obj = new See();
        
        System.out.println(" String D Name:"+ obj.name);
        System.out.println("int: " +obj.age);
        System.out.println("boolean: "+ obj.men);
        System.out.println("float "+obj.taka);
        System.out.println("double: " +obj.hight);
        System.out.println("char:" +obj.gender);
        System.out.println("byte:"+obj.b);
        System.out.println("short: "+obj.s);
        System.out.println("long: "+obj.L);
    }
}
