
package testeranimal;


abstract class Animal {
 String name;
 public Animal (String name){
     this.name=name;
 }
  public abstract void sound();
  
  public void sleep(){
      System.out.println("Ghum");
}
  public void showname(){
      
  }
}
