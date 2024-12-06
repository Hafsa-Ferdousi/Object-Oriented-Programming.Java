

package com.mycompany.dog;


public class Dog {
    
    private String name;
    private String color;
    
    public Dog(){
        this.name= "petu";
        this.color="red";
    }
     public String getA(){
         return name;
     }
     public String getB(){
         return color;
     }
    public static void main(String[] args) {
        Dog D =new Dog();
        System.out.println("Dog's name- " + D.getA());
        System.out.println("Dog's color- "+ D.getB());
    }
}
