
package digitnumo;


public class Digit {
    private  int number;
  Digit(int n){
    number =n; 
  } 
    public int digitMultiplication(){
       int a = number; //both a and ans is int
       int ans = 1;
       while (a > 0) {
            ans *= a%10;//mod by 10 gives the last digit. so if a=53, ans is 3.
            System.out.println("ans: "+ans);
	    a/=10;//53/10=5.3;but as a is int we just get 5 so the second digit is received
            System.out.println("a: "+a);
        }
	return ans;
    }

  public void output() {
      System.out.println("The digit multiplication of : " + number + " is " + digitMultiplication());
    }
}
