
package amimaltest;


public class Dog extends Aminal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " bark" );
    }
    
    @Override
    public void showName(){
    super.showName();
        System.out.println("This is Dog");
        
}
}
