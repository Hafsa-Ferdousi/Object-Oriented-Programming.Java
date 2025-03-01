
package example;

public class A {
    private int a;
    private float b;
    
    A(){
        System.out.println("caling the constrctor");
    }
    
    public A setint(int a){
        this.a=a;
        return this;
        
    }
     public A setfloat(float b){
         this.b=b;
        return this;
        
    }
     
     void display(){
         System.out.println("Display= "+a+" "+b);
     }
    
}
