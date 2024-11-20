/*
  Define a class Organism. The class contains the initial size 
of the organism and the growth rate.
Create a constructor to initialize the instance variables.
Then, define a class Animal. Animal is an organism that has extra instance variable
which is the amount of eating. Create a constructor to initialize 
the instance variable and a method 
to display the Animal instance variables.
 */
package animalor;


public class AnimalOr {

   
    public static void main(String[] args) {
        Animal a = new Animal(1.2,2.3,5.5);
    a.display();

    }
    
}
