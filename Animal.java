/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalor;

/**
 *
 * @author Asus
 */
public class Animal extends Organism{
       private double eating; //don’t want anyone to

    public Animal(double a, double b, double c) {
	super(a, b);//reusing parent class constructor Organism. By using super, the child can access the parent classes everything
        eating = c;

    
  }
     public void display() {
        System.out.println("Initial size of the organism: " + size);
        System.out.println("Growth Rate: " + rate);
        System.out.println("Eating requirement: " + eating);
    }    
          }

