/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animaltest;

/**
 *
 * @author Asus
 */
public class Dog extends Animal implements Pet  {
private String breed;
    public Dog(String Name, int age,String breed) {
        super(Name, age);
        this.breed= breed;
    }

    @Override
    void makeSound() {
        System.out.println( getName() + "'s sound woof.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing ft");
    }
    
    public void displaybreed(){
        System.out.println(getName() + " is "+ breed); 
    }
    
}
