
package digitclass;


public class Digit {
    int number;
    public Digit(int number){
        this.number=number;
        
    }
    
    public int digitMutipication(){
        int a =number;
        int ans=1;
        while(a>0){
          ans*=a%10;
          a/=10;
            System.out.println("Ans "+ans);
            System.out.println("a "+a);
        }
        return ans;
    }
    public void output(){
        System.out.println("Multipication of number of " +number+"is " + digitMutipication() );
    }
}
