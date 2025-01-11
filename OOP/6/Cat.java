
package animaltest;


public class Cat extends Animal implements Pet {
   private String color;
    public Cat(String Name, int age,String color) {
        super(Name, age);
        this.color=color;
    }

    @Override
    void makeSound() {
       System.out.println( getName() +"'s sound meow");
               }

    @Override
    public void play() {
         System.out.println(getName() + " is playing ft");
    }
    public void displayColor(){
        System.out.println(getName() + " is "+ color + " and age is "+ getAge()); 
        
        
        
    }
    
}
