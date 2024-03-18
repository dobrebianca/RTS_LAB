package Lab1;

import java.util.ArrayList;
import java.util.Collections;
public class Random {
    ArrayList<Integer> vector = new ArrayList<>(10);

    public static void main(String[] args) {
        Random random = new Random(); // Create an instance of the Lab1.Random class

        for (int i = 0; i < 10; i++) {
            double randomDouble = Math.random();
            int randomNumber = (int) (randomDouble * 100);
            random.vector.add(randomNumber); // Add the generated number to the vector
            System.out.println(randomNumber);
        }
        // Sort the vector
        Collections.sort(random.vector);
        // Print the contents of the vector
        System.out.println("The vector with the elements sorted: " + random.vector);
    }
}
