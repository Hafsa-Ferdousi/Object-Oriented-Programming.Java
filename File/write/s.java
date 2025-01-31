
package s;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException; 
import java.util.Random;

public class s{
    public static void main(String[] args) {
        String f = "Lab08_01.txt";
        Random r= new Random();

        try (FileWriter fi = new FileWriter(f, true);  // Open file in append mode
             BufferedWriter b = new BufferedWriter(fi)) {

            // Generate and write 100 random integers to the file
            for (int i = 0; i < 100; i++) {
                int ra = r.nextInt(100);  // Generate random integers in the range 999]
                b.write(ra + " ");
            }
            b.newLine();  // Add a newline for clarity

            System.out.println("Successfully written 100 random integers to the file " + f);

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
