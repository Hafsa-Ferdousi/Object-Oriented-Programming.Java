/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeranimal;

/**
 *
 * @author Asus
 */
public class TesterAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Dog d=new Dog("tom");
        Cat c=new Cat("c");
        c.sleep();
        c.sound();
        d.sleep();
        d.sound();
    }
    
}
