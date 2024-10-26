

package com.mycompany.mavenproject2;



    import java.util.Scanner;

public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String strin=scan.nextLine();
    
        // Write your code here.

        System.out.println("String:" +strin);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
