
package animaltest;


public abstract class Animal {
private String Name;
private int age;
 Animal(String Name,int age){
     this.Name=Name;
     this.age=age;
     
 }
 public String getName(){
     return Name;
 }
 public int getAge(){
     return age;
 }
 abstract void makeSound();

    void play() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void displayColor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void displaybreed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
