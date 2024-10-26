/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.age;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking user for age input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
            String message = "congo";
            System.out.println(message);
        } else {
            System.out.println("You are not eligible to vote.");
            String message2 = "sorry";
            System.out.println(message2);
        }

        // Another example of a statement:
        String verificationMessage = "Age verification complete.";
        System.out.println(verificationMessage);

         // Close the scanner
    }
}