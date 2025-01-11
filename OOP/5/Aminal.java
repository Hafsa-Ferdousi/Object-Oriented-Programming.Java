
package amimaltest;


abstract class Aminal {
    String name;
    public Aminal( String name){
      this.name=name;
    }
    public abstract void sound();
    
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }
    
    public void showName(){
        System.out.println("The anmimal name is "+ name);
    }
}
