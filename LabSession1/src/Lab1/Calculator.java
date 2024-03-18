package Lab1;

import java.util.Scanner;
public class Calculator {
    private double real;
    private double imaginary;

    // Constructor

    // Getters
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the real part of the complex number
        System.out.print("Enter the real part of the first complex number: ");
        double realPart = scanner.nextDouble();

        // Prompt the user to enter the imaginary part of the complex number
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginaryPart = scanner.nextDouble();

        // Create the complex number object
        ComplexNumber complexNumber = new ComplexNumber(realPart, imaginaryPart);

        // Print the complex number
        System.out.println("Complex Number: " + complexNumber);

        // Prompt the user to enter the real part of the complex number
        System.out.print("Enter the real part of the first complex number: ");
        double realPart2 = scanner.nextDouble();

        // Prompt the user to enter the imaginary part of the complex number
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginaryPart2 = scanner.nextDouble();

        // Create the complex number object
        ComplexNumber complexNumber2 = new ComplexNumber(realPart2, imaginaryPart2);

        // Print the complex number
        System.out.println("Complex Number: " + complexNumber2);


        //Display menu
        System.out.println("Choose the desidered step");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        int choice=scanner.nextInt();;
        double resultreal = 0;
        double resultimaginary=0;
        switch (choice) {
            case 1:
                resultreal = realPart + realPart2;
                resultimaginary=imaginaryPart+imaginaryPart2;
                System.out.println("Result: " + resultreal + " + " + resultimaginary + "*i " );
                break;
            case 2:
                resultreal = realPart - realPart2;
                resultimaginary=imaginaryPart-imaginaryPart2;
                System.out.println("Result: " + resultreal + " + " + resultimaginary + "*i " );
            case 3:
                resultreal = realPart * (realPart2 + imaginaryPart2) + imaginaryPart2*(realPart2 + imaginaryPart2);
                resultimaginary=imaginaryPart*imaginaryPart2;
                System.out.println("Result: " + resultreal + " + " + resultimaginary + "*i " );
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }






}
