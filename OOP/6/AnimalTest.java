
package animaltest;


public class AnimalTest {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal [] a=new Animal[2];
        a[0]=new Cat("piku",2,"red");
        a[1]= new Dog("tom",2,"golden");
        a[0].makeSound();
        a[0].play();
        a[0].displayColor();
         
        
        System.out.println();
        
        a[1].makeSound();
        a[1].play();
        a[1].displaybreed();
        
    }
    
}
