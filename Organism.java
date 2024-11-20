/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalor;

/**
 *
 * @author Asus
 */
public class Organism {
      protected double size, rate; //only its subclasses (that is whoever extended it) can access them

    public Organism(double a, double b) {
	size = a;
        rate = b;
    }        

}
