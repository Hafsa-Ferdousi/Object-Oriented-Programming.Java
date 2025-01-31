/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a;

/**
 *
 * @author Asus
 */import java.io.*;

public class A {
    public static void main(String[] args) {
        String binaryFileName = "data.dat";
        String resultFileName = "results.txt";

        try {
            // Step 1: Write integers 1 to 100 to a binary file
            try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(binaryFileName)))) {
                for (int i = 1; i <= 100; i++) {
                    dos.writeInt(i);
                }
            }

            // Step 2: Read integers from the binary file and perform calculations
            int sum = 0;
            int count = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(binaryFileName)))) {
                while (dis.available() > 0) {
                    int number = dis.readInt();
                    sum += number;           
                    count++;
                    if (number > max) max = number; 
                    if (number < min) min = number;
                }
            }

           // double average = (count > 0) ? (double) sum / count : 0;
           double average = (double) sum / count;


            // Step 3: Write results to a text file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(resultFileName))) {
                writer.write("Sum: " + sum + "\n");
                writer.write("Average: " + average + "\n");
                writer.write("Maximum: " + max + "\n");
                writer.write("Minimum: " + min + "\n");
            }

            // Print the results to the console
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);

        }   catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
