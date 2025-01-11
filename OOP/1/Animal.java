/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeranimal;

/**
 *
 * @author Asus
 */
abstract class Animal {
 String name;
 public Animal (String name){
     this.name=name;
 }
  public abstract void sound();
  
  public void sleep(){
      System.out.println("Ghum");
}
  public void showname(){
      
  }
}
