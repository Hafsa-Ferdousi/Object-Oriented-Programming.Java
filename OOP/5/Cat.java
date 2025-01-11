
package amimaltest;

public class Cat extends  Aminal  {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name+ " meows");
    }
    
    @Override
    public void showName(){
     super.showName();
     
        System.out.println("this is cat");
    }
}
