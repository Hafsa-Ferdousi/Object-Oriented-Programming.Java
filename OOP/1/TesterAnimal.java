
package testeranimal;


public class TesterAnimal {

    public static void main(String[] args) {
      
        Dog d=new Dog("tom");
        Cat c=new Cat("c");
        c.sleep();
        c.sound();
        d.sleep();
        d.sound();
    }
    
}
